import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    // Variables to store user inputs
    private String textField1Input;
    private String textField2Input;
    private String textField3Input;
    private String textField4Input;
    private String textField5Input;

    // GUI Components for JFrame 1
    private JLabel projectLabel1;
    private JLabel textField1Label;
    private JLabel textField2Label;
    private JTextField textField1;
    private JTextField textField2;
    private JButton submitButton1;

    // GUI Components for JFrame 2
    private JLabel projectLabel2;
    private JLabel textField3Label;
    private JLabel textField4Label;
    private JLabel textField5Label;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton submitButton2;

    // GUI Components for JFrame 3
    private JLabel projectLabel3;
    private JLabel textField1OutputLabel;
    private JLabel textField2OutputLabel;
    private JLabel textField3OutputLabel;
    private JLabel textField4OutputLabel;
    private JLabel textField5OutputLabel;
    private JLabel textField1Output;
    private JLabel textField2Output;
    private JLabel textField3Output;
    private JLabel textField4Output;
    private JLabel textField5Output;

    // Constructor
    public Main() {
        // JFrame 1 Components
        projectLabel1 = new JLabel("Project Title");
        projectLabel1.setHorizontalAlignment(JLabel.CENTER);
        textField1Label = new JLabel("Text Field 1:");
        textField2Label = new JLabel("Text Field 2:");
        textField1 = new JTextField();
        textField2 = new JTextField();
        submitButton1 = new JButton("Submit");
        submitButton1.addActionListener(this);

        // JFrame 2 Components
        projectLabel2 = new JLabel("Project Title");
        projectLabel2.setHorizontalAlignment(JLabel.CENTER);
        textField3Label = new JLabel("Text Field 3:");
        textField4Label = new JLabel("Text Field 4:");
        textField5Label = new JLabel("Text Field 5:");
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        submitButton2 = new JButton("Submit");
        submitButton2.addActionListener(this);

        // JFrame 3 Components
        projectLabel3 = new JLabel("Project Title");
        projectLabel3.setHorizontalAlignment(JLabel.CENTER);
        textField1OutputLabel = new JLabel("Text Field 1:");
        textField2OutputLabel = new JLabel("Text Field 2:");
        textField3OutputLabel = new JLabel("Text Field 3:");
        textField4OutputLabel = new JLabel("Text Field 4:");
        textField5OutputLabel = new JLabel("Text Field 5:");
        textField1Output = new JLabel();
        textField2Output = new JLabel();
        textField3Output = new JLabel();
        textField4Output = new JLabel();
        textField5Output = new JLabel();

        // Set layout for JFrame 1
        setLayout(new GridLayout(4, 2));
        add(projectLabel1);
        add(new JLabel());
        add(textField1Label);
        add(textField1);
        add(textField2Label);
        add(textField2);
        add(new JLabel());
        add(submitButton1);

        // Set layout for JFrame 2
        setLayout(new GridLayout(6, 2));
        add(projectLabel2);
        add(new JLabel());
        add(new JLabel());
        add(new JLabel());
        add(textField3Label);
        add(textField3);
        add(textField4Label);
        add(textField4);
        add(textField5Label);
        add(textField5);
        add(new JLabel());
        add(submitButton2);

        // Set layout for JFrame 3
        setLayout(new GridLayout(7, 2));
        add(projectLabel3);
        add(new JLabel());
        add(textField1OutputLabel);
        add(textField1Output);
        add(textField2OutputLabel);
        add(textField2Output);
        add(textField3OutputLabel);
        add(textField3Output);
        add(textField4OutputLabel);
        add(textField4Output);
        add(textField5OutputLabel);
        add(textField5Output);

        // Set JFrame properties
        setTitle("My GUI Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    // Action performed method for buttons
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton1) {
            // Store user inputs from JFrame 1
            textField1Input = textField1.getText();
            textField2Input = textField2.getText();

            // Redirect to JFrame 2
            setContentPane(getFrame2Components());
            validate();
        } else if (e.getSource() == submitButton2) {
            // Store user inputs from JFrame 2
            textField3Input = textField3.getText();
            textField4Input = textField4.getText();
            textField5Input = textField5.getText();

            // Display collected inputs on JFrame 3
            textField1Output.setText(textField1Input);
            textField2Output.setText(textField2Input);
            textField3Output.setText(textField3Input);
            textField4Output.setText(textField4Input);
            textField5Output.setText(textField5Input);

            // Redirect to JFrame 3
            setContentPane(getFrame3Components());
            validate();
        }
    }

    // Method to get components for JFrame 2
    private JPanel getFrame2Components() {
        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(projectLabel2);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(textField3Label);
        panel.add(textField3);
        panel.add(textField4Label);
        panel.add(textField4);
        panel.add(textField5Label);
        panel.add(textField5);
        panel.add(new JLabel());
        panel.add(submitButton2);
        return panel;
    }

    // Method to get components for JFrame 3
    private JPanel getFrame3Components() {
        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.add(projectLabel3);
        panel.add(new JLabel());
        panel.add(textField1OutputLabel);
        panel.add(textField1Output);
        panel.add(textField2OutputLabel);
        panel.add(textField2Output);
        panel.add(textField3OutputLabel);
        panel.add(textField3Output);
        panel.add(textField4OutputLabel);
        panel.add(textField4Output);
        panel.add(textField5OutputLabel);
        panel.add(textField5Output);
        return panel;
    }

    // Main method to run the application
    public static void main(String[] args) {
        new Main();
    }
}

