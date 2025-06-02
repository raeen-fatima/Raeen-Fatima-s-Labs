package AccessSpecifiers.External;


import AccessSpecifiers.Person;

public class SubPerson extends Person {
    public static void main(String[] args) {
        SubPerson sp = new SubPerson();

        sp.showPublic();      // ✅ Public
        // sp.showPrivate();  // ❌ Not accessible
        sp.showProtected();   // ✅ Protected: accessible in subclass
        // sp.showDefault();  // ❌ Default not accessible
    }
}
