package Wrapper;
public class MethodBoxing {
    static int getInt(Integer a) {
        return a; // Auto-unbox
    }

    public static void main(String[] args) {
        Integer x = getInt(30); // Auto-box
        System.out.println(x);
    }
}
