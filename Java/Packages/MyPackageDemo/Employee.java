package MyPackageDemo;

public class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void show() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}