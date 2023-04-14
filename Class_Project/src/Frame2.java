import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame2 extends JFrame {
    JLabel projectLabel, label1, label2, label3;
    JTextField textField1, textField2, textField3;
    JButton button;

    public Frame2(String text1, String text2) {
        super("Frame 2");
        setLayout(new GridLayout(6, 2));

        projectLabel = new JLabel("Project Heading");
        add(projectLabel);

        add(new JLabel());

        label1 = new JLabel("Text Field 1");
        add(label1);

        textField1 = new JTextField(text1);
        add(textField1);

        label2 = new JLabel("Text Field 2");
        add(label2);

        textField2 = new JTextField(text2);
        add(textField2);

        label3 = new JLabel("Text Field 3");
        add(label3);

        textField3 = new JTextField();
        add(textField3);

        button = new JButton("Submit");
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text3 = textField3.getText();
                dispose();
                new Frame3(text1, text2, text3);
            }
        });

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
