package Threads;
class ThreadLifeCycleDemo extends Thread {
    public void run() {
        System.out.println(getName() + " is running.");
        try {
            Thread.sleep(1000);  // Thread goes into timed waiting state for 1 second
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " has finished execution.");
    }
}

public class LifecycleTest {
    public static void main(String[] args) {
        ThreadLifeCycleDemo t1 = new ThreadLifeCycleDemo();
        t1.start();  // Moves from new to runnable to running
        System.out.println(t1.getState());  // Could print RUNNABLE or TIMED_WAITING depending on timing
    }
}
