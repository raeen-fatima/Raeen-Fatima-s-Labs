// Task: Simple Method Program
// Write a Java program that:
// Defines a method greetUser(String name) that prints "Hello, <name>!"
// Defines a method add(int a, int b) that returns the sum
// Calls both methods from main()


public class MethodExample {

    // Method 1: greetUser
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 2: add two integers and return the result
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling greetUser
        greetUser("Fatima");

        // Calling add
        int result = add(10, 20);
        System.out.println("Sum is: " + result);
    }
}


