package AccessSpecifiers;


public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        // Accessing from same package
        p.showPublic();      // ✅ Public
        p.accessPrivate();   // ✅ Private (indirectly)
        p.showProtected();   // ✅ Protected
        p.showDefault();     // ✅ Default
    }
}

