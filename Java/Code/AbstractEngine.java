package Code;

abstract class Vehicle {
    String color;
    Vehicle(String color) {
        this.color = color;
    }
    void move() {
        System.out.println("Vehicle is moving.");
    }
    abstract void startEngine();  // subclass must implement
}

class Car extends Vehicle {
    Car(String color) {
        super(color);
    }
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

public class AbstractEngine{
    public static void main(String[] args) {
        Car car = new Car("Red");
        car.startEngine();
        car.move();
    }
}
