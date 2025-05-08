// Write a Java program that:
// Takes your name, course name, and semester number as input using Scanner
// Prints them in a formatted sentence like:
// "Fatima is in Semester 3 of BCA Cyber Security"

import java.util.Scanner;

public class ExScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Your Semester: ");
        int semester = sc.nextInt();

        System.out.println(name + " is in Semester " + semester + " of " + course);

        sc.close(); 
    }
}
