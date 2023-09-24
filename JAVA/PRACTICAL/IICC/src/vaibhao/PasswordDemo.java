package vaibhao;

/* Write a program in Java to demonstrate the use of JPasswordField.*/
import javax.swing.*;

public class PasswordDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Password Demo");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Password:");
		JPasswordField passwordField = new JPasswordField(20);
		panel.add(label);
		panel.add(passwordField);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
