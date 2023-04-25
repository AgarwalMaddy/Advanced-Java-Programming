import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBeans extends JPanel implements java.io.Serializable {
    private JLabel nameLabel;
    private JTextField nameField;

    private JButton submitButton;

    MyBeans() {
        nameLabel = new JLabel("Enter Name");
        add(nameLabel);

        nameField = new JTextField(20);
        add(nameField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ButtonListener());
        submitButton.setSize(20,20);
        add(submitButton);
    }

    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Pressed");
            String name = getName();
            System.out.println("Name: " + name);
        }
    }
        public String getName(){
            return nameField.getText();
        }

        public void setName(String name){
        nameField.setText(name);
        }

}
