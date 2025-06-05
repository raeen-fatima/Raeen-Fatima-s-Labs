package Threads;
class MyRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000); // timed waiting state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished execution.");
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable());

        System.out.println("State after creation: " + t.getState()); // NEW

        t.start();
        System.out.println("State after start: " + t.getState()); // RUNNABLE

        Thread.sleep(500);
        System.out.println("State during sleep: " + t.getState()); // TIMED_WAITING

        t.join();
        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}
