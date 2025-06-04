package Exceptions;
//Imagine you have a phonebook app, and you try to get the first letter of a name, but the name is not set (null).
public class NullPointer_Demo {
    public static void main(String[] args) {
        try {
            String name = null;       // name is not set
            System.out.println(name.charAt(0));  // Trying to get first character
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        }
    }
}
