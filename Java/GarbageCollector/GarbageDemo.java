package GarbageCollector;

 class Demo {
    int id;
    Demo(int id) {
        this.id = id;
    }
}

public class GarbageDemo {
    public static void main(String[] args) {
        Demo obj1 = new Demo(1);  // obj1 references object
        Demo obj2 = new Demo(2);  // obj2 references another object

        obj1 = null;  // object with id=1 no longer referenced
        // The object with id=1 is now eligible for garbage collection

        // obj2 still references object with id=2, so it is safe
        System.out.println(obj1);
        System.out.println(obj2);

        System.gc();  // suggest JVM to run GC (not guaranteed immediately)
        System.out.println(obj1);

        // obj2 is still referenced, so it is safe
    }
}
