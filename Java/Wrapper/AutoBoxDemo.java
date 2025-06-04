package Wrapper;
public class AutoBoxDemo {
    public static void main(String[] args) {
        Integer x = 100;
        ++x; // x = x + 1
        System.out.println("x: " + x);

        Integer b = x + (x / 3);
        System.out.println("b: " + b);

        int i = x + (x / 3);
        System.out.println("i: " + i);
    }
}
