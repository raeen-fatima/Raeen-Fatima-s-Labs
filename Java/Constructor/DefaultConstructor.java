package Constructor;

    class Bike {
    Bike() {
        System.out.println("Bike is ready.");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bike b1 = new Bike();  // default constructor called
        Bike b2 = new Bike();  // default constructor called again

        System.out.println(b1);
        System.out.println(b2);
    }
}
