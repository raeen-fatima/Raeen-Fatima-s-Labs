package Interface;
// Create the Main Class

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();      // from interface
        myDog.sleep();    // from interface
        myDog.bark();     // class-specific
    }
}

