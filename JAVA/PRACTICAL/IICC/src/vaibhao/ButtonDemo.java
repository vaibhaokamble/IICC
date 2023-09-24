package vaibhao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*Write a program in Java m when a button is pressed it will display
a message “Welcome to IICC”.*/

public class ButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Press the button to display a message.");
        frame.getContentPane().add(label, BorderLayout.CENTER);

        JButton button = new JButton("Press me!");
        button.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
        	label.setText("Welcome to iicc");
            }
        });
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
