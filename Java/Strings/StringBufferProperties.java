package Strings;
public class StringBufferProperties {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Initial content: " + sb.toString());
        System.out.println("Length: " + sb.length());     // 5 characters
        System.out.println("Capacity: " + sb.capacity()); // 16 (default) + 5 = 21

        sb.append(", welcome to Java!");
        System.out.println("After append: " + sb.toString());
        System.out.println("Length now: " + sb.length());     // updated length
        System.out.println("Capacity now: " + sb.capacity()); // capacity might increase

        sb.delete(5, 13);
        System.out.println("After delete: " + sb.toString());
        System.out.println("Length now: " + sb.length());
        System.out.println("Capacity now: " + sb.capacity());
    }
}
