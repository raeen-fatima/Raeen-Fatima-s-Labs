package Exceptions;
//You can even pass custom data with your exceptions, e.g., an error code.

class NewException extends Exception {
    int errorCode;
    NewException(int code) {
        errorCode = code;
    }
    public String toString() {
        return "Exception error code = " + errorCode;
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new NewException(5);
        } catch (NewException e) {
            System.out.println(e);
        }
    }
}

    // Output: Exception error code = 5
