package Exceptions;

public class TestCustomException {
    static void validateAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not valid age to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        } finally {
            System.out.println("Validation completed");
        }
    }
}

