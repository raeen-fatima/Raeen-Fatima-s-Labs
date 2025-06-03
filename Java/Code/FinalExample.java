package Code;
class FinalDemo {
    final int MAX = 100;  // final variable, constant

    // final method - cannot be overridden
    final void display() {
        System.out.println("This is a final method.");
    }

    void show() {
        // MAX = 200;  // Error! Cannot assign value to final variable
        System.out.println("MAX value: " + MAX);
    }
}

class TestFinal extends FinalDemo {
    /*
    void display() {
        // Error! Cannot override final method
    }
    */
}

public class FinalExample {
    public static void main(String[] args) {
        TestFinal obj = new TestFinal();
        obj.show();
        obj.display();
    }
}
