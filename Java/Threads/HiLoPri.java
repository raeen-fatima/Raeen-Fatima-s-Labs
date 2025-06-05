package Threads;
class XYZ implements Runnable {
    long click = 0;
    Thread x;
    private volatile boolean running = true;

    public XYZ(int a) {
        x = new Thread(this);
        x.setPriority(a);
    }

    public void run() {
        while (running) {
            click++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        x.start();
    }
}

public class HiLoPri {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        XYZ hi = new XYZ(Thread.NORM_PRIORITY + 2); // Priority 7
        XYZ lo = new XYZ(Thread.NORM_PRIORITY - 2); // Priority 3

        lo.start();
        hi.start();

        try {
            Thread.sleep(10000); // Wait for 10 seconds
        } catch (InterruptedException e) {}

        lo.stop();
        hi.stop();

        try {
            hi.x.join();
            lo.x.join();
        } catch (InterruptedException e) {}

        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);
    }
}
