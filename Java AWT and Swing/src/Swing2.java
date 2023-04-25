
import javax.swing.*;

public class Swing2 {

	public static void main(String[] args) {
		
		String s1, s2;
		int a, b, n;
		s1 = JOptionPane.showInputDialog("enter the first no.");
		a = Integer.parseInt(s1);
		s2 = JOptionPane.showInputDialog("enter second no.");
		b = Integer.parseInt(s2);
		n = a +b;
		JOptionPane.showMessageDialog(null, "The sum is " + n, "Results",JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
		//System.out.println("The output = "+n);
		// TODO Auto-generated method stub
	}

}
