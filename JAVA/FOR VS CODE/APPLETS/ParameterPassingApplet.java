import java.applet.Applet;
import java.awt.Graphics;

public class ParameterPassingApplet extends Applet {
    private String message;

    public void init() {
        message = getParameter("message");
        if (message == null) {
            message = "Hello, World!";
        }
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }
}
