package Exceptions;
//When you try to access a character at an invalid index of a string.

public class StringIndexOutOfBound_Demo {
    public static void main(String[] args) {
        try {
            String greeting = "Hello";
            char c = greeting.charAt(10);  // Index 10 does not exist
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e);
        }
    }
}
//OUTPUT:
//StringIndexOutOfBoundsException caught:
// java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 5