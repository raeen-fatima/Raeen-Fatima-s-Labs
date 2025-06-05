package GUI;
import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet {
    String fontName;
    int fontSize;
    float leading;
    boolean accountEnabled;

    public void start() {
        fontName = getParameter("fontName");
        fontSize = Integer.parseInt(getParameter("fontSize"));
        leading = Float.parseFloat(getParameter("leading"));
        accountEnabled = Boolean.parseBoolean(getParameter("accountEnabled"));
    }

    public void paint(Graphics g) {
        g.drawString("Font: " + fontName, 10, 20);
        g.drawString("Size: " + fontSize, 10, 35);
        g.drawString("Leading: " + leading, 10, 50);
        g.drawString("Active: " + accountEnabled, 10, 65);
    }
}