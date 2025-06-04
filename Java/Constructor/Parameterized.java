package Constructor;

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " - " + age);
    }
}

public class Parameterized{
    public static void main(String[] args) {
        Student s1 = new Student("Fatima", 21);
        s1.show();
    }
}

