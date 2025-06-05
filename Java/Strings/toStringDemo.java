package Strings;
class Table {
  double width, height, depth;

  Table(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  public String toString() {
    return "Dimensions are " + width + " by " + depth + " by " + height;
  }
}

public class toStringDemo {
  public static void main(String[] args) {
    Table t = new Table(10, 12, 14);
    System.out.println(t); // toString() is automatically called
  }
}
