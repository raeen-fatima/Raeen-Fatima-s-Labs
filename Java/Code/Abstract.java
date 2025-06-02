package Code;

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method (with body)
    void eat() {
        System.out.println("The animal is eating.");
    }
}
class Dog extends Animal {
    // Provide the implementation of the abstract method
    void sound() {
        System.out.println("The dog barks.");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Creating an object of Dog (which is a subclass of Animal)

        myAnimal.sound();  // Calls the overridden sound() method of Dog
        myAnimal.eat();    // Calls the eat() method from Animal
    }
}
