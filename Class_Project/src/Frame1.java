import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame {
    JLabel projectLabel, label1, label2;
    JTextField textField1, textField2;
    JButton button;

    public Frame1() {
        super("Frame 1");
        setLayout(new GridLayout(4, 2));

        projectLabel = new JLabel("Project Heading");
        add(projectLabel);

        add(new JLabel());

        label1 = new JLabel("Text Field 1");
        add(label1);

        textField1 = new JTextField();
        add(textField1);

        label2 = new JLabel("Text Field 2");
        add(label2);

        textField2 = new JTextField();
        add(textField2);

        button = new JButton("Submit");
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                dispose();
                new Frame2(text1, text2);
            }
        });

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame1();
    }
}
