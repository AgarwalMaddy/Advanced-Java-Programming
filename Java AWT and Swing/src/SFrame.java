import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class SFrame {
	private JLabel lbl;
	private JTextField txt;
	private JButton btn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("My Frame");
		JLabel lbl = new JLabel("Enter your name:");
		JTextField txt = new JTextField(20);
		JButton btn = new JButton("Click !");
		frame.setLayout(new FlowLayout());
		frame.add(lbl);
		frame.add(txt);
		frame.add(btn);
		frame.pack();
		frame.setVisible(true);
		
	
		}
		
	}

