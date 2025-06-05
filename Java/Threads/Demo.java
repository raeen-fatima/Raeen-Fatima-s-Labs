package Threads;
class MyThread extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000);  // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Thread starts and calls run()
        System.out.println("Main thread running.");
    }
}
