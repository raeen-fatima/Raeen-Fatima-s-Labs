package Exceptions;
public class MultiCatchdemo {
    public static void main(String args[]) {
        try {
            int x = args.length;  // command line arguments ka length
            System.out.println("x = " + x);
            int y = 42 / x;       // divide by zero error jab args.length = 0
            int z[] = {1};
            z[52] = 99;           // array index out of bounds error
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");
    }
}
// OUTPUT:
// x = 0
// Divide by 0: java.lang.ArithmeticException: / by zero
// After try/catch blocks.
