// Task: Array Basics Program
// Write a Java program that:

// Creates an integer array of 5 elements

// Takes 5 numbers as input from the user

// Prints all elements

// Calculates and prints the sum of all elements


import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // Array of size 5
        int sum = 0;

        // Input elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i]; // Add to sum
        }

        // Print elements
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

        // Print sum
        System.out.println("Sum of elements: " + sum);

        sc.close();
    }
}
