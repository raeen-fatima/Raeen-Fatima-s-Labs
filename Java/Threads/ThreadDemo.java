package Threads;
class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(500);  // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Cook 1");
        t2.setName("Cook 2");

        t1.start();  // Start thread 1
        t2.start();  // Start thread 2
    }
}
