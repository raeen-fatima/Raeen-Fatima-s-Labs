// MethodOverride.java
package Code;

class Animals {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animals ad = new Dog();
        ad.sound();
    }
}
