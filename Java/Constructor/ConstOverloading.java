package Constructor;

    
class Box {
    int length, width;

    // Default
    Box() {
        length = width = 0;
    }

    // One parameter
    Box(int side) {
        length = width = side;
    }

    // Two parameters
    Box(int l, int w) {
        length = l;
        width = w;
    }

    void show() {
        System.out.println("Box: " + length + " x " + width);
    }
}

public class ConstOverloading {
   public static void main(String[] args) {
        Box b1 = new Box();               // Default constructor
        Box b2 = new Box(5);         // One-parameter constructor (square)
        Box b3 = new Box(4, 6);       // Two-parameter constructor (rectangle)

        b1.show();  // Output: Box: 0 x 0
        b2.show();  // Output: Box: 5 x 5
        b3.show();  // Output: Box: 4 x 6
    }
}
