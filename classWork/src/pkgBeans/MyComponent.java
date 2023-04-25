package pkgBeans;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComponent extends JPanel implements java.io.Serializable {
    
    private JLabel label;
    private JTextField textField;
    private JButton button;
	
    public MyComponent() {      
        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Click me!");
        button.addActionListener(new ButtonListener()); // add ActionListener to button
        button.setSize(20, 20);
        add(label);
        add(textField);
        add(button);
    }
    
    public String getName() {
        return textField.getText();
    }
    
    public void setName(String name) {
        textField.setText(name);
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
            String name = getName();
            System.out.println("Name entered: " + name);
        }
    }
}
