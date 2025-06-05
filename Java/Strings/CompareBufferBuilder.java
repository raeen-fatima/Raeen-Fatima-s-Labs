package Strings;
public class CompareBufferBuilder {
    public static void main(String[] args) {
        // StringBuffer (Thread-safe)
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println("StringBuffer: " + sbuf.toString());

        // StringBuilder (Not thread-safe, faster)
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World");
        System.out.println("StringBuilder: " + sbuilder.toString());
    }
}
