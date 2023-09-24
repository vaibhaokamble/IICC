package saurabh;
import java.awt.*;

public class RedBgBtn extends Frame{
public static void main(String[] args) {
	
	Frame f= new Frame("Red bg BUtton");
	
	
	Button btn = new Button("Click Me");
	btn.setBounds(20,20,100,100);
	f.setBackground(Color.RED);
	f.setLayout(null);
	f.add(btn);
	f.setSize(400,400);
	f.setVisible(true);
	
}
}
