package vaibhao;


import java.applet.Applet;
import java.awt.Graphics;

/* Write a program in Java to demonstrate the use of parameter
passing in an Applet.*/


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
