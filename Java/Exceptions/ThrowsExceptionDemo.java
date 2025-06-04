package Exceptions;

public class ThrowsExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());  // NullPointerException
    }
}

//OUTPUT

// Exception in thread "main" java.lang.NullPointerException
// 	at ThrowsExceptionDemo.main(ThrowsExceptionDemo.java:4)
