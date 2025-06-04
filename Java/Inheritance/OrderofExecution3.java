package Inheritance;
//Calling Same-Class Constructor using this()
public class OrderofExecution3 {
    OrderofExecution3() {
        this("CallParam");
        System.out.println("Default constructor executed.");
    }

    OrderofExecution3(String str) {
        System.out.println("Parameterized constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Order of constructor execution...");
        OrderofExecution3 obj = new OrderofExecution3();
        System.out.println(obj);
    }
}

        //OUTPUT:
        //Order of constructor execution...
        //Parameterized constructor executed.
        //Default constructor executed.
        //Inheritance.OrderofExecution3@15db9742