import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class Input_Transfer {
    private JFrame frame1;
    private JFrame frame2;
    private JFrame frame3;
    private JFrame frame4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;

    public Input_Transfer() {
        // Frame 1
        frame1 = new JFrame("Frame 1");
        frame1.setLayout(new BorderLayout());
        frame1.add(new JLabel("Complaint Registration Portal"), BorderLayout.NORTH);
        JPanel panel1 = new JPanel(new GridLayout(3, 2));
        panel1.add(new JLabel("Name"));
        textField1 = new JTextField();
        panel1.add(textField1);
        panel1.add(new JLabel("Registration Number"));
        textField2 = new JTextField();
        panel1.add(textField2);
        panel1.add(new JLabel("Room Number"));
        textField3 = new JTextField();
        panel1.add(textField3);
        frame1.add(panel1, FlowLayout.CENTER);
        JButton button1 = new JButton("Proceed");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = textField1.getText();
                text2 = textField2.getText();
                frame2.setVisible(true);
                frame1.setVisible(false);
            }
        });
        frame1.add(button1, BorderLayout.SOUTH);
        frame1.setSize(370, 260);
        frame1.setVisible(true);

        // Frame 2
        frame2 = new JFrame("Frame 2");
        frame2.setLayout(new BorderLayout());
        frame2.add(new JLabel("Your Complaint"), BorderLayout.NORTH);
        JPanel panel2 = new JPanel(new GridLayout(2, 2));
        panel2.add(new JLabel("Complaint Category"));
        textField4 = new JTextField();
        panel2.add(textField4);
        panel2.add(new JLabel("Complaint"));
        textField5 = new JTextField();
        panel2.add(textField5);
        frame2.add(panel2, BorderLayout.CENTER);
        JButton button2 = new JButton("Next");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text3 = textField3.getText();
                text4 = textField4.getText();
                text5 = textField5.getText();
                frame3.setVisible(true);
                frame2.setVisible(false);
            }
        });
        JButton button3 = new JButton("Back");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(true);
                frame2.setVisible(false);
            }
        });
        frame2.add(button2, BorderLayout.SOUTH);
        frame2.add(button3, BorderLayout.AFTER_LINE_ENDS);
        frame2.setSize(350, 200);

        // Frame 3
        frame3 = new JFrame("Frame 3");
        frame3.setLayout(new BorderLayout());
        frame3.add(new JLabel("Complaint"), BorderLayout.NORTH);
        JPanel panel3 = new JPanel(new GridLayout(1, 6));
        JButton button4 = new JButton("Action");
        JLabel display1 = new JLabel();
        display1.setText(textField1.getText());
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame4.setVisible(true);
                frame3.setVisible(false);
            }
        });
        panel3.add(display1);
        frame3.add(button4, BorderLayout.SOUTH);
        frame3.add(panel3, BorderLayout.CENTER);
        frame3.setSize(400, 300);

        // Frame 4
        frame4 = new JFrame("Frame 4");
        frame4.setSize(400,400);
        frame4.setLayout(new GridLayout(4, 2));
        frame4.add(new JLabel("Working Since"));
        JTextField workingSinceField = new JTextField();
        frame4.add(workingSinceField);
        JButton button5 = new JButton("Calculate");
        frame4.add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int workingSince = Integer.parseInt(workingSinceField.getText());
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int yearsOfWorking = currentYear - workingSince;
                int salary = Integer.parseInt(text5);
                if (yearsOfWorking > 10 && salary <= 10000) {
                    JOptionPane.showMessageDialog(frame4, "According to our calculations you are paid less for your work!");
                } else {
                    JOptionPane.showMessageDialog(frame4, "You are paid enough for work based upon the experience you have");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Input_Transfer();
    }
}