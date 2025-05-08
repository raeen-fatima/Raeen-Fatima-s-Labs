//  Task: Simple Menu-Based Calculator
// Take two numbers and an operator choice from the user, and perform the selected operation:
// 1 → Addition
// 2 → Subtraction
// 3 → Multiplication
// 4 → Division
// Any other → Invalid choice

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Menu
        System.out.println("Choose operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        // Switch case to perform operation
        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
