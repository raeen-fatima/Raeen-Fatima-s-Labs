// Calling Parent-Class Constructor using super()
package Inheritance;
class ParentClass {
    int a;
    ParentClass(int x) {
        a = x;
    }
}

class ChildClass extends ParentClass {
    int b;
    ChildClass(int x, int y) {
        super(x); // Call to parent constructor
        b = y;
    }

    void Show() {
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}

public class OrderofExecution4 {
    public static void main(String[] args) {
        System.out.println("Order of constructor execution...");
        ChildClass obj = new ChildClass(79, 89);
        obj.Show();
    }
}
//Output: 
// Order of constructor execution...
// Value of a : 79
// Value of b : 89
