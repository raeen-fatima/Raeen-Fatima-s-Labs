package Threads;
class Data {
    private int value;
    private boolean available = false;

    // synchronized method for producer to put value
    public synchronized void put(int val) {
        while (available) { // if value already available, wait for consumer
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        value = val;
        available = true;
        System.out.println("Produced: " + val);
        notify();  // notify consumer that data is available
    }

    // synchronized method for consumer to get value
    public synchronized int get() {
        while (!available) { // if no value, wait for producer
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        available = false;
        System.out.println("Consumed: " + value);
        notify();  // notify producer to produce more
        return value;
    }
}

class Producer implements Runnable {
    Data data;

    Producer(Data d) {
        this.data = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.put(i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class Consumer implements Runnable {
    Data data;

    Consumer(Data d) {
        this.data = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.get();
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class ProdConsExample {
    public static void main(String[] args) {
        Data data = new Data();
        Thread producer = new Thread(new Producer(data));
        Thread consumer = new Thread(new Consumer(data));
        producer.start();
        consumer.start();
    }
}
