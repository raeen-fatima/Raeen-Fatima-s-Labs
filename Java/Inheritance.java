//SuperClass Animal 
 class Animal {
    //properties 
    String name;

    //Constructor 
    public Animal(String name) {
        this.name = name ;
    }

    //MEthid in superclass
    public void eat() {
        System.out.println( name + " is Eating.");
    }

    //Method in superclass
    public void sleep() {
        System.out.println(name + " is Sleeping.");
    }
 }

 //Sublclass: Dog inherits from Animal 
 class Dog extends Animal {
    //Contructor and Subclass
    public Dog(String name) {
        super(name); // => Calling superclass constructor
    }
    //MEthod in subclass 
    public void bark() {
        System.out.println(name + " is barking.");
    }
 }

 public class Inheritance {
    public static void main(String[] args) {
        
        //Create an instance of Dog 
        Dog dog1 = new Dog("MiniMAx");

        //CAlling MEthods from both superclass and subclass
        dog1.eat(); //inherited from ANimal
        dog1.sleep();//inherited from Animal
        dog1.bark();//Specific to Dog

    }
 }