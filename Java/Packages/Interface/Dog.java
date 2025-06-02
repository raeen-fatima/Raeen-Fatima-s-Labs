package Interface;
//Implement the Interface in a Class
    
public class Dog implements Animal { //implements:-	Used by class to implement interface
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

