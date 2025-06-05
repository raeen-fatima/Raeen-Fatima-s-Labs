package Strings;
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        // Append multiple words efficiently
        sb.append(" World");
        sb.append("! Welcome to StringBuffer.");
        
        System.out.println(sb.toString());
    }
}
