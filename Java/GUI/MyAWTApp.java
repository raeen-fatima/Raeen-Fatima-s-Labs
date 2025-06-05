package GUI;
import java.awt.*;

public class MyAWTApp {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Frame");
        Button b = new Button("Click Here");

        b.setBounds(50, 100, 80, 30); // x, y, width, height
        f.add(b); // add button to frame
        f.setSize(300, 300);
        f.setLayout(null); // absolute positioning
        f.setVisible(true);
    }
}
