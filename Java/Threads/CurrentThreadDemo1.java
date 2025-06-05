package Threads;
public class CurrentThreadDemo1 {
    public static void main(String args[]) {
        // Get reference to current thread (main thread)
        Thread td = Thread.currentThread();
        System.out.println("Current thread: " + td);

        // Change the thread's name
        td.setName("My Thread");
        System.out.println("After name change: " + td);

        try {
            for(int n = 7; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);  // Pause thread for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
