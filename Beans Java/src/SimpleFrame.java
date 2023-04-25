import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleFrame {
	 	 static JLabel label;
	     static JTextField textField;
	     static JButton button;
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Click me!");
        //button.addActionListener(new ButtonListener()); // add ActionListener to button
        button.setSize(20, 20);
        frame.setLayout(new FlowLayout());	 //set default layout for frame.
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);  
       
    }
}