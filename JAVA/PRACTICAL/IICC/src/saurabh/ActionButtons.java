package saurabh;
import java.awt.*;
import java.awt.event.*;

public class ActionButtons extends Frame{
	public static void main (String []args) {
		Frame f= new Frame();
		final TextField tf= new TextField();
		tf.setBounds(10,40,100,100);
		Button btn= new Button("Click Me");
		btn.setBounds(20,20,70,70);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
			tf.setText("Welcome to IICC");
			}
		});
		f.add(btn);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
