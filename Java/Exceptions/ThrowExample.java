package Exceptions;
public class ThrowExample {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");  // throwing exception explicitly
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        validate(15);  // will throw exception
        System.out.println("End of main");
    }
}
