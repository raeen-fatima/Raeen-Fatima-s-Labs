package Strings;
public class StringReplaceDemo {
  public static void main(String args[]) {
    String a = "This is a Java test. This is, too.";
    String b = "is";
    String c = "was";
    String result = "";
    int x;

    do {
      x = a.indexOf(b);
      if(x != -1) {
        result = a.substring(0, x) + c + a.substring(x + b.length());
        a = result;
      }
      System.out.println(a);
    } while(x != -1);
  }
}

