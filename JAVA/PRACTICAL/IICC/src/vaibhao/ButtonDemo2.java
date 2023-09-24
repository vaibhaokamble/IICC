package vaibhao;

/*Write a program in Javato create JButton with ActionListener.(i.e. when
user click on Button, it ill display some meassage)*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Demo");
		JPanel panel = new JPanel();
		JButton button = new JButton("Click me!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Hello, Vaibhao!");
			}
		});
		panel.add(button);
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
