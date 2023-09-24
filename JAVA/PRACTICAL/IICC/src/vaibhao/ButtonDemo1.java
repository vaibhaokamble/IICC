package vaibhao;
/*Write a program in Java swing to create a button and add it in JFrame.*/
import javax.swing.*;

public class ButtonDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Demo");
        JButton button = new JButton("Click me!");
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
