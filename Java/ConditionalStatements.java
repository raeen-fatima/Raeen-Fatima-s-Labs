// Write a Java program that:
// Takes an integer score (e.g., 0–100)
// Use if-else-if ladder to print:
// 90–100: "Excellent"
// 70–89: "Very Good"
// 50–69: "Good"
// 35–49: "Pass"
// Below 35: "Fail"

public class ConditionalStatements {
    public static void main(String[] args) {
         int score = 27 ; 
        if (score >= 90){
            System.out.println("Exellent");
        }
        else if (score >= 70){
            System.out.println("Very Good");
        }
        else if (score >= 50){
            System.out.println("Good");
        }
        else if (score >= 35){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
