package AccessSpecifiers;


public class Person {

    public String name = "Fatima";
    private int age = 22;
    protected String email = "fatima@example.com";
    String city = "Mumbai"; // default

    public void showPublic() {
        System.out.println("Public: " + name);
    }

    private void showPrivate() {
        System.out.println("Private: " + age);
    }

    protected void showProtected() {
        System.out.println("Protected: " + email);
    }

    void showDefault() {
        System.out.println("Default: " + city);
    }

    // A method to demonstrate private access from inside
    public void accessPrivate() {
        showPrivate();
    }
}
