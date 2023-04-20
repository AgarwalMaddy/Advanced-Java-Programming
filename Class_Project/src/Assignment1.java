import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment1 extends JFrame implements ActionListener {
    private final JTextField voltageField;
    private final JTextField currentField;
    private final JTextField resistorField;
    private final JButton calculateButton;

    public Assignment1() {
        super("Physics Calculator");
        setLayout(new GridLayout(4, 2));
        setSize(400, 200);

        JLabel voltageLabel = new JLabel("Voltage (V):");
        add(voltageLabel);

        voltageField = new JTextField(10);
        add(voltageField);

        JLabel currentLabel = new JLabel("Current (I):");
        add(currentLabel);

        currentField = new JTextField(10);
        add(currentField);

        JLabel resistorLabel = new JLabel("Resistor (R):");
        add(resistorLabel);

        resistorField = new JTextField(10);
        add(resistorField);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            double voltage = 0.0;
            double current = 0.0;
            double resistor = 0.0;

            try {
                voltage = Double.parseDouble(voltageField.getText());
            } catch (NumberFormatException ex) {}

            try {
                current = Double.parseDouble(currentField.getText());
            } catch (NumberFormatException ex) {}

            try {
                resistor = Double.parseDouble(resistorField.getText());
            } catch (NumberFormatException ex) {}

            if ((voltage == 0.0 && current == 0.0) || (voltage == 0.0 && resistor == 0.0) || (current == 0.0 && resistor == 0.0)) {
                JOptionPane.showMessageDialog(this, "Please enter one more value to continue", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (voltage != 0.0 && current != 0.0 && resistor != 0.0) {
                double calculatedCurrent = voltage / resistor;
                if (calculatedCurrent == current) {
                    getContentPane().setBackground(Color.GREEN);
                } else {
                    getContentPane().setBackground(null);
                }
            } else if (voltage == 0.0 && current != 0.0 && resistor != 0.0) {
                voltage = current * resistor;
                voltageField.setText(String.valueOf(voltage));
            } else if (current == 0.0 && voltage != 0.0 && resistor != 0.0) {
                current = voltage / resistor;
                currentField.setText(String.valueOf(current));
            } else if (resistor == 0.0 && voltage != 0.0 && current != 0.0) {
                resistor = voltage / current;
                resistorField.setText(String.valueOf(resistor));
            }
        }
    }

    public static void main(String[] args) {
        Assignment1 calculator = new Assignment1();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.pack();
        calculator.setVisible(true);
    }
}