package Wrapper;
public class CharBoolDemo {
    public static void main(String[] args) {
        Boolean x = true;

        if (x) { // auto-unboxed
            System.out.println("x is true");
        }

        Character ch = 'Z'; // auto-box
        char ch2 = ch;      // auto-unbox
        System.out.println("char: " + ch2);
    }
}
