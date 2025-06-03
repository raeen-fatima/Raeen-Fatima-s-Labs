package Exceptions;
import java.util.Random;

public class HandleErrorDemo {
    public static void main(String args[]) {
        int x = 0, y, z;
        Random a = new Random();

        for(int i = 0; i < 10; i++) {
            try {
                y = a.nextInt(10);  // Random int between 0 to 9
                z = a.nextInt(10);
                x = 56789 / (y / z); // Risky division
            } catch (ArithmeticException e) {
                System.out.println("Division by zero occurred.");
                x = 0;  // Default value when exception occurs
            }
            System.out.println("x: " + x);
        }
    }
}
