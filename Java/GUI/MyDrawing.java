package GUI;
import javax.swing.*;
import java.awt.*;

public class MyDrawing extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawLine(0, 0, 100, 100);
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 60);
        g.fillOval(200, 100, 80, 50);
        g.drawString("Graphics in Java!", 100, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Demo");
        frame.add(new MyDrawing());
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
