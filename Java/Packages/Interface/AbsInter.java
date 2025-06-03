package Interface;
interface Chargeable {
    void charge();
}

abstract class Vehicle {
    abstract void drive();
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class ElectricBike extends Vehicle implements Chargeable {
    void drive() {
        System.out.println("Electric bike is driving");
    }
    public void charge() {
        System.out.println("Charging electric bike battery");
    }
}

public class AbsInter {
    public static void main(String[] args) {
        ElectricBike bike = new ElectricBike();
        bike.drive();
        bike.charge();
        bike.stop();
    }
}
