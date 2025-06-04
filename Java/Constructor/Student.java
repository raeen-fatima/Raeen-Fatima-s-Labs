package Constructor;

    //Task: Create a Student class with constructor and create an array of 3 students with different names and marks. Display their data.
    
 class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
   
    public static void main(String[] args) {
        Student[] students = {
            new Student("Fatima", 90),
            new Student("Raeen", 85),
            new Student("Adeeb", 92)
        };

        for (Student s : students) {
            s.display();
        }
    }
}

