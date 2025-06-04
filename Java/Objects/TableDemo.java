class Table {
    double width;
    double height;
    double depth;

    // Parameterized constructor
    Table(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume of the table
    double volume() {
        return width * height * depth;
    }
}

public class TableDemo {
    public static void main(String[] args) {
        // Creating two Table objects with different sizes
        Table table1 = new Table(5, 20, 15);
        Table table2 = new Table(4, 6, 9);

        System.out.println("Volume of table1: " + table1.volume());
        System.out.println("Volume of table2: " + table2.volume());
    }
}
