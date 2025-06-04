// MethodOverride.java
package Code;

class Birds {
    void voice() {
        System.out.println("Animal makes a sound.");
    }
}

class Sparrow extends Birds {
    @Override
    void voice() {
        System.out.println("Dog barks");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Birds a = new Birds();
        a.voice();

        Sparrow d = new Sparrow();
        d.voice();

        Birds ad = new Sparrow();
        ad.voice();
    }
}
