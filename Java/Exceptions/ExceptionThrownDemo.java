package Exceptions;


public class ExceptionThrownDemo {
    static int divideByZero(int x, int y) {
        int i = x / y;   // Causes ArithmeticException
        return i;
    }

    static int computeDivision(int x, int y) {
        int a = 0;
        try {
            a = divideByZero(x, y);
        } catch (NumberFormatException ex) {  // Won't catch ArithmeticException
            System.out.println("NumberFormatException occurred");
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 1, y = 0;
        try {
            int i = computeDivision(x, y);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
// OUTPUT:- 
// / by zero
