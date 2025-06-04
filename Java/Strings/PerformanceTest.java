package Strings;
public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        String str = "";
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        System.out.println("String time: " + (endTime - startTime) + " ns");

        StringBuffer sb = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");
    }
}
