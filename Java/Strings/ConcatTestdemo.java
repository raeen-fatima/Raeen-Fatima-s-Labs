package Strings;
public class ConcatTestdemo {
    public static String concatString() {
        String a = "Java";
        for (int x = 0; x < 10000; x++) {
            a = a + "Tpoint";  // Creates new String object every time
        }
        return a;
    }

    public static String concatStringBuffer() {
        StringBuffer b = new StringBuffer("Java");
        for (int x = 0; x < 10000; x++) {
            b.append("Tpoint");  // Modifies existing object
        }
        return b.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatString();
        System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        concatStringBuffer();
        System.out.println("Time taken by Concating with StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
