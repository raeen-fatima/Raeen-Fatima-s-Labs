package Wrapper;
public class UnboxingError {
    public static void main(String[] args) {
        Integer x = 1000;
        int y = x.byteValue(); // manually extract byte value

        System.out.println(y); // Unexpected: -24
    }
}

