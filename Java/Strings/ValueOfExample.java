package Strings;
public class ValueOfExample {
    public static void main(String[] args) {
        int i = 90;
        double f = 3.56789;
        String a = "91";

        // Convert int to String
        String sample = String.valueOf(i);     // "90"
        System.out.println(sample);            // Prints 90
        System.out.println(sample + i);        // "90" + 90 = "9090" (String concatenation)

        // Convert double to String
        sample = String.valueOf(f);            // "3.56789"
        System.out.println(sample);            // Prints 3.56789

        System.out.println(a + sample);        // "91" + "3.56789" = "913.56789"
    }
}
