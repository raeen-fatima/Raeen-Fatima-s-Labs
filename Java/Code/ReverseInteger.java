package Code;

public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;        // Get the last digit
            x = x / 10;                // Remove last digit from x

            // Check for overflow before multiplying
            if (reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10) {
                return 0;
            }

            reversed = reversed * 10 + digit; // Append the digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        int x = 123;
        int result = reverse(x);
        System.out.println("Reversed: " + result);
    }
}
