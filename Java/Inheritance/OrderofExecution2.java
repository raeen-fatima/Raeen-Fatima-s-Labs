package Inheritance;
//Order in Multilevel Inheritance
class Hospital {
    Hospital() {
        System.out.println("Hospital constructor executed");
    }
}

class Department extends Hospital {
    Department() {
        System.out.println("Department constructor executed");
    }
}

class Patient extends Department {
    Patient() {
        System.out.println("Patient constructor executed");
    }
}

public class OrderofExecution2 {
    public static void main(String[] args) {
        System.out.println("Order of constructor execution in Multilevel inheritance...");
        new Patient();
    }
}

//OUTPUT:
// Order of constructor execution in Multilevel inheritance...
// Hospital constructor executed
// Department constructor executed
// Patient constructor executed
