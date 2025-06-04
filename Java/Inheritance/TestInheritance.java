package Inheritance;
class Vehicle {
    Vehicle(String type) {
        System.out.println("Vehicle constructor called for type: " + type);
    }
}

class Car extends Vehicle {
    Car() {
        super("Car");  // Explicitly calling superclass constructor with parameter
        System.out.println("Car constructor called.");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        new Car();
    }
}
