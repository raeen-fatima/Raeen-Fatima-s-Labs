package Wrapper;

public class WrapDemo {
    public static void main(String[] args) {
        Integer a = new Integer(30);   // Boxing
        int x = a.intValue();          // Unboxing
        System.out.println(x + " " + a);
    }
}

