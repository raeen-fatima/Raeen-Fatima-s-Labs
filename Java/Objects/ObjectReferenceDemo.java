class Table {
    int size;

    // Constructor to initialize size
    Table(int s) {
        size = s;
    }

    void showSize() {
        System.out.println("Table size: " + size);
    }
}

public class ObjectReferenceDemo {
    public static void main(String[] args) {
        // Step 1: Create a Table object and assign reference to t1
        Table t1 = new Table(5);

        // Step 2: Assign reference of t1 to t2 (both point to same object)
        Table t2 = t1;

        // Show sizes using both references
        t1.showSize();  // Output: Table size: 5
        t2.showSize();  // Output: Table size: 5

        // Modify object via t2 reference
        t2.size = 10;

        // Both references see the change because it's the same object
        t1.showSize();  // Output: Table size: 10
        t2.showSize();  // Output: Table size: 10

        // Set t1 to null (remove reference)
        t1 = null;

        // t2 still points to the object, so it can access it
        t2.showSize();  // Output: Table size: 10

        // If both t1 and t2 become null, object is eligible for garbage collection
    }
}
