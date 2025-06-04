package Inheritance;
//Order of Execution in Single Inheritance
class FatherClass {
    FatherClass() {
        System.out.println("FatherClass constructor executed.");
    }
}

class SonClass extends FatherClass {
    SonClass() {
        System.out.println("SonClass constructor executed.");
    }
}

public class OrderofExecution1 {
    public static void main(String[] args) {
        System.out.println("Order of constructor execution...");
        new SonClass();
    }
}

// Output:
// Order of constructor execution...
// FatherClass constructor executed.
// SonClass constructor executed.

