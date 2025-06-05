package Interface;
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class ImplementingClass implements ChildInterface {
    public void childMethod() {
        System.out.println("Welcome to Java!!");
    }

    public void parentMethod() {
        System.out.println("Interface extend!");
    }
}

public class ExtendingAnInterface {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.childMethod();
        obj.parentMethod();
    }
}
