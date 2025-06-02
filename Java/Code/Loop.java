// Write a Java program using:
// A for loop to print numbers 1 to 10
// A while loop to print even numbers from 2 to 20
// A do-while loop to print numbers in reverse from 5 to 1
package Code;

public class Loop {
    public static void main(String[] args) {
        // for loop to print numbers 1 to 10
        for (int i = 1; i <= 10; i++){
            System.out.println("Count: " + i);
        }
        // while loop to print even numbers from 2 to 20 
        int i = 2 ;
        while (i <= 20){
            System.out.println("Even: " + i);
            i += 2;
        }
        // a Do while loop to print numbers in reverse from 5 to 1
        int j = 5;
        do {
            System.out.println("Reverse: " + j);
            j--;
        } while (j >= 1);

    }
}
