// Final Class
final class Vehicle {
    private String model;

    // Constructor
    public Vehicle(String model) {
        this.model = model;
    }

    // Method
    public void showDetails() {
        System.out.println("Vehicle Model: " + model);
    }
}

// This will give a compile-time error because 'Vehicle' is a final class
// class Car extends Vehicle { // Error: Cannot inherit from final 'Vehicle' class
//     // Additional methods or properties
// }

public class TestFinalClass {
    public static void main(String[] args) {
        // Create an object of the final class
        Vehicle vehicle = new Vehicle("Toyota Corolla");
        vehicle.showDetails();
    }
}
