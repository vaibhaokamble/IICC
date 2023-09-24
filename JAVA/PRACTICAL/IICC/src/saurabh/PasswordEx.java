package saurabh;
import javax.swing.*;

public class PasswordEx {
	public static void main(String []args) {
	JFrame f= new JFrame();
	JPasswordField p = new JPasswordField();
	JLabel l = new JLabel("Password");

	p.setBounds(100,100,100,30);
	l.setBounds(50,50,80,80);
	
	f.add(p);
	f.add(l);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
}
}