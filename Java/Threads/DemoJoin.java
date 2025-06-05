package Threads;

class NewThreadDemo implements Runnable {
    String name;
    Thread a;

    NewThreadDemo(String threadname) {
        name = threadname;
        a = new Thread(this, name);
        System.out.println("New thread: " + a);
        a.start(); // Start the thread
    }

    public void run() {
        try {
            for(int x = 3; x > 0; x--) {
                System.out.println(name + ": " + x);
                Thread.sleep(1200); // Delay to simulate task
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}
public class DemoJoin {
    public static void main(String args[]) {
        NewThreadDemo ob1 = new NewThreadDemo("One");
        NewThreadDemo ob2 = new NewThreadDemo("Two");
        NewThreadDemo ob3 = new NewThreadDemo("Three");

        // Check if threads are alive initially
        System.out.println("Thread One is alive: " + ob1.a.isAlive());
        System.out.println("Thread Two is alive: " + ob2.a.isAlive());
        System.out.println("Thread Three is alive: " + ob3.a.isAlive());

        try {
            // Wait for all threads to finish
            System.out.println("Waiting for threads to complete.");
            ob1.a.join(); // main waits for Thread One
            ob2.a.join(); // then waits for Thread Two
            ob3.a.join(); // then waits for Thread Three
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        // Check again after joining
        System.out.println("Thread One is alive: " + ob1.a.isAlive());
        System.out.println("Thread Two is alive: " + ob2.a.isAlive());
        System.out.println("Thread Three is alive: " + ob3.a.isAlive());

        System.out.println("Main thread exiting.");
    }
}
