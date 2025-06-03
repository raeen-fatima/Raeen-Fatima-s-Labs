package Code;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 10 / 0;  // This causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Divide by zero");
        } finally {
            System.out.println("Finally block executes always");
        }
        System.out.println("Rest of the program continues");
    }
}
