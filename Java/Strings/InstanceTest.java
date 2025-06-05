package Strings;
public class InstanceTest {
    public static void main(String args[]) {
        System.out.println("Hashcode test of String:");
        String a = "Java";
        System.out.println(a.hashCode());  
        a = a + "tpoint";
        System.out.println(a.hashCode());  // Different hashcode since new object created

        System.out.println("Hashcode test of StringBuffer:");
        StringBuffer b = new StringBuffer("Java");
        System.out.println(b.hashCode());  
        b.append("tpoint");  
        System.out.println(b.hashCode());  // Same hashcode as object is modified, not recreated
    }
}
