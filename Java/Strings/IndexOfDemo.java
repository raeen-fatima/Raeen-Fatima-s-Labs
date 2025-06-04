package Strings;
public class IndexOfDemo {
  public static void main(String args[]) {
    String a = "Now is the time for all good men to come to the aid of their country.";
    System.out.println("indexOf('b') = " + a.indexOf('b'));
    System.out.println("lastIndexOf('b') = " + a.lastIndexOf('b'));
    System.out.println("indexOf(\"the\") = " + a.indexOf("the"));
    System.out.println("lastIndexOf(\"the\") = " + a.lastIndexOf("the"));
  }
}
