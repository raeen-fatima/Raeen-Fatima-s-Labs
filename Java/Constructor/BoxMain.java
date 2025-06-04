package Constructor;

    class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double getVolume() {
        return length * width * height;
    }

}
public class BoxMain {
    public static void main(String[] args) {
        Box myBox = new Box(5.0, 4.0, 3.0);
        System.out.println("Volume: " + myBox.getVolume());
    }
}


