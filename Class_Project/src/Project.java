import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project {
    private JFrame frame1;
    private JFrame frame2;
    private JFrame frame3;
    private JFrame frame4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private String value1;
    private String value2;
    private String value3;
    private String value4;
    private String value5;

    public static void main(String[] args) {
        Project project = new Project();
        project.createFrame1();
    }

    public void createFrame1() {
        frame1 = new JFrame("Frame 1");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 300);
        frame1.setLayout(new GridLayout(5, 2));

        JLabel projectLabel = new JLabel("Project Label", SwingConstants.CENTER);
        frame1.add(projectLabel);

        JLabel label1 = new JLabel("Text Field 1");
        frame1.add(label1);

        textField1 = new JTextField();
        frame1.add(textField1);

        JLabel label2 = new JLabel("Text Field 2");
        frame1.add(label2);

        textField2 = new JTextField();
        frame1.add(textField2);

        JButton button = new JButton("Next");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value1 = textField1.getText();
                value2 = textField2.getText();
                createFrame2();
                frame1.setVisible(false);
            }
        });
        frame1.add(button);

        frame1.setVisible(true);
    }

    public void createFrame2() {
        frame2 = new JFrame("Frame 2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(400, 300);
        frame2.setLayout(new GridLayout(5, 2));

        JLabel projectLabel = new JLabel("Project Label", SwingConstants.CENTER);
        frame2.add(projectLabel);

        JLabel label3 = new JLabel("Text Field 3");
        frame2.add(label3);

        textField3 = new JTextField();
        frame2.add(textField3);

        JLabel label4 = new JLabel("Text Field 4");
        frame2.add(label4);

        textField4 = new JTextField();
        frame2.add(textField4);

        JLabel label5 = new JLabel("Text Field 5");
        frame2.add(label5);

        textField5 = new JTextField();
        frame2.add(textField5);

        JButton button = new JButton("Next");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value3 = textField3.getText();
                value4 = textField4.getText();
                value5 = textField5.getText();
                createFrame3();
                frame2.setVisible(false);
            }
        });
        frame2.add(button);

        frame2.setVisible(true);
    }

    public void createFrame3() {
        frame3 = new JFrame("Frame 3");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(400, 300);
        frame3.setLayout(new GridLayout(7, 2));

        JLabel projectLabel = new JLabel("Project Label", SwingConstants.CENTER);
        frame3.add(projectLabel);

        JLabel label1 = new JLabel("Value 1");
        frame3.add(label1);

        JLabel valueLabel1 = new JLabel(value1);
        frame3.add(valueLabel1);

        JLabel label2 = new JLabel("Value 2");
        frame3.add(label2);

        JLabel valueLabel2 = new JLabel(value2);
        frame3.add(valueLabel2);

        JLabel label3 = new JLabel("Value 3");
        frame3.add(label3);

        JLabel valueLabel3 = new JLabel(value3);
        frame3.add(valueLabel3);

        JLabel label4 = new JLabel("Value 4");
        frame3.add(label4);

        JLabel valueLabel4 = new JLabel(value4);
        frame3.add(valueLabel4);

        JLabel label5 = new JLabel("Value 5");
        frame3.add(label5);

        JLabel valueLabel5 = new JLabel(value5);
        frame3.add(valueLabel5);

        JButton button1 = new JButton("Yes");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame3, "We are happy to see you paid enough for your work!");
            }
        });
        frame3.add(button1);

        JButton button2 = new JButton("No");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createFrame4();
                frame4.setVisible(true);
                frame3.setVisible(false);
            }
        });
        frame3.add(button2);

        frame3.setVisible(true);
    }

    public void createFrame4() {
        frame4 = new JFrame("Frame 4");
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setSize(400, 300);
        frame4.setLayout(new GridLayout(4, 2));

        JLabel salaryLabel = new JLabel("Salary Receiving");
        frame4.add(salaryLabel);

        JLabel salaryValueLabel = new JLabel(value5);
        frame4.add(salaryValueLabel);

        JLabel workingSinceLabel = new JLabel("Working Since");
        frame4.add(workingSinceLabel);

        textField6 = new JTextField();
        frame4.add(textField6);

        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int workingSince = Integer.parseInt(textField6.getText());
                int currentYear = java.time.Year.now().getValue();
                int yearsOfWorking = currentYear - workingSince;
                if (yearsOfWorking > 10 && Integer.parseInt(value5) < 10000) {
                    JOptionPane.showMessageDialog(frame4, "Ok");
                }
            }
        });
        frame4.add(button);

        frame4.setVisible(true);
    }
}