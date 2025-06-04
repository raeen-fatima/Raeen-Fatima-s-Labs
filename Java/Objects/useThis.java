
//use of this Keyword to refer to instance variables in constructor
class thisCube {
    int width, height, depth;

    thisCube(int width, int height, int depth) {
        // Use 'this' to refer to instance variables
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        return width * height * depth;
    }
}
public class useThis {
    public static void main(String[] args) {
        thisCube cube = new thisCube(5, 10, 15);
        System.out.println("Volume: " + cube.volume());
    }
}
