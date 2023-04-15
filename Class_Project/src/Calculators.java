import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculators extends JFrame {
    public Calculators() {
        // Set frame title
        super("Calculators");

        // Set layout
        setLayout(new BorderLayout());

        // Create title label and add to frame
        JLabel titleLabel = new JLabel("Different Types of Calculators", SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        // Create panel for choices and buttons
        JPanel choicesPanel = new JPanel();
        choicesPanel.setLayout(new GridLayout(3, 2));

        // Create labels and buttons for choices
        String[] choices = {"SI Calculator", "CI Calculator", "Currency Converter"};
        for (String choice : choices) {
            JLabel choiceLabel = new JLabel(choice);
            JButton choiceButton = new JButton("Go to " + choice);
            switch (choice) {
                case "SI Calculator" -> choiceButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new Choice1Frame();
                    }
                });
                case "CI Calculator" -> choiceButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new Choice2Frame();
                    }
                });
                case "Currency Converter" -> choiceButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new Choice3Frame();
                    }
                });
            }
            choicesPanel.add(choiceLabel);
            choicesPanel.add(choiceButton);
        }

        // Add choices panel to frame
        add(choicesPanel, BorderLayout.CENTER);

        // Set frame size and location
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculators();
    }
}

class Choice1Frame extends JFrame {
    public Choice1Frame() {
        // Set frame title
        super("Simple Interest Calculator");

        // Set layout
        setLayout(new BorderLayout());

        // Create heading label and add to frame
        JLabel headingLabel = new JLabel("SI Calculator", SwingConstants.CENTER);
        add(headingLabel, BorderLayout.NORTH);

        // Create panel for labels and text fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        // Create labels and text fields
        String[] labels = {"Principal Amount", "Rate of Interest", "Time (in years)", "Interest", "Total Amount"};
        JTextField[] textFields = new JTextField[5];
        for (int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel(labels[i]);
            JTextField textField = new JTextField();
            if (i >= 3) {
                textField.setEditable(false);
            }
            textFields[i] = textField;
            inputPanel.add(label);
            inputPanel.add(textField);
        }

        // Add input panel to frame
        add(inputPanel, BorderLayout.CENTER);

        // Create calculate button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(textFields[0].getText());
                    double rate = Double.parseDouble(textFields[1].getText());
                    double time = Double.parseDouble(textFields[2].getText());
                    double interest = principal * rate * time / 100;
                    double total = principal + interest;
                    textFields[3].setText(String.valueOf(interest));
                    textFields[4].setText(String.valueOf(total));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add calculate button to frame
        add(calculateButton, BorderLayout.SOUTH);

        // Set frame size and location
        setSize(400, 300);
        // Set frame size and location
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set frame visible
        setVisible(true);
    }
}
class Choice2Frame extends JFrame {
    public Choice2Frame() {
        // Set frame title
        super("Compound Interest Calculator");

        // Set layout
        setLayout(new BorderLayout());

        // Create heading label and add to frame
        JLabel headingLabel = new JLabel("CI Calculator", SwingConstants.CENTER);
        add(headingLabel, BorderLayout.NORTH);

        // Create panel for labels and input fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));

        // Create labels and text fields
        String[] labels = {"Principal Amount", "Rate of Interest", "Time (in years)", "Compound Frequency", "Interest", "Total Amount"};
        JTextField[] textFields = new JTextField[6];
        for (int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel(labels[i]);
            if (i == 3) {
                String[] options = {"Yearly", "Half-Yearly", "Quarterly"};
                JComboBox<String> comboBox = new JComboBox<>(options);
                inputPanel.add(label);
                inputPanel.add(comboBox);
            } else {
                JTextField textField = new JTextField();
                if (i >= 4) {
                    textField.setEditable(false);
                }
                textFields[i] = textField;
                inputPanel.add(label);
                inputPanel.add(textField);
            }
        }

        // Add input panel to frame
        add(inputPanel, BorderLayout.CENTER);

        // Create calculate button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(textFields[0].getText());
                    double rate = Double.parseDouble(textFields[1].getText());
                    double time = Double.parseDouble(textFields[2].getText());
                    String frequency = (String) ((JComboBox) inputPanel.getComponent(7)).getSelectedItem();
                    int n = switch (frequency) {
                        case "Half-Yearly" -> 2;
                        case "Quarterly" -> 4;
                        default -> 1;
                    };
                    double amount = principal * Math.pow(1 + rate / n / 100, n * time);
                    double interest = amount - principal;
                    textFields[4].setText(String.format("%.2f", interest));
                    textFields[5].setText(String.format("%.2f", amount));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add calculate button to frame
        add(calculateButton, BorderLayout.SOUTH);

        // Set frame size and location
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set frame visible
        setVisible(true);
    }
}
class Choice3Frame extends JFrame {
    public Choice3Frame() {
        // Set frame title
        super("Currency Converter");

        // Set layout
        setLayout(new BorderLayout());

        // Create heading label and add to frame
        JLabel headingLabel = new JLabel("Convert Currency", SwingConstants.CENTER);
        add(headingLabel, BorderLayout.NORTH);

        // Create panel for currency conversion
        JPanel conversionPanel = new JPanel();
        conversionPanel.setLayout(new GridLayout(5, 1));

        // Create panel for input currency
        JPanel inputCurrencyPanel = new JPanel();
        inputCurrencyPanel.setLayout(new FlowLayout());

        // Create labels and radio buttons for input currency
        String[] currencies = {"INR", "USD", "EUR"};
        ButtonGroup inputCurrencyGroup = new ButtonGroup();
        for (String currency : currencies) {
            JLabel currencyLabel = new JLabel(currency);
            JRadioButton currencyRadioButton = new JRadioButton();
            inputCurrencyGroup.add(currencyRadioButton);
            inputCurrencyPanel.add(currencyLabel);
            inputCurrencyPanel.add(currencyRadioButton);
        }

        // Add input currency panel to conversion panel
        conversionPanel.add(inputCurrencyPanel);

        // Create text field for input value
        JTextField inputValueField = new JTextField(10);

        // Add input value field to conversion panel
        conversionPanel.add(inputValueField);

        // Create panel for output currency
        JPanel outputCurrencyPanel = new JPanel();
        outputCurrencyPanel.setLayout(new FlowLayout());

        // Create labels and radio buttons for output currency
        ButtonGroup outputCurrencyGroup = new ButtonGroup();
        for (String currency : currencies) {
            JLabel currencyLabel = new JLabel(currency);
            JRadioButton currencyRadioButton = new JRadioButton();
            outputCurrencyGroup.add(currencyRadioButton);
            outputCurrencyPanel.add(currencyLabel);
            outputCurrencyPanel.add(currencyRadioButton);
        }

        // Add output currency panel to conversion panel
        conversionPanel.add(outputCurrencyPanel);

        // Create text field for output value
        JTextField outputValueField = new JTextField(10);
        outputValueField.setEditable(false);

        // Add output value field to conversion panel
        conversionPanel.add(outputValueField);

        // Add conversion panel to frame
        add(conversionPanel, BorderLayout.CENTER);

        // Create calculate button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(inputValueField.getText());
                    double outputValue = 0;
                    String inputCurrency = "";
                    for (Component component : inputCurrencyPanel.getComponents()) {
                        if (component instanceof JRadioButton) {
                            JRadioButton radioButton = (JRadioButton) component;
                            if (radioButton.isSelected()) {
                                int index = inputCurrencyPanel.getComponentZOrder(radioButton);
                                JLabel label = (JLabel) inputCurrencyPanel.getComponent(index - 1);
                                inputCurrency = label.getText();
                                break;
                            }
                        }
                    }
                    String outputCurrency = "";
                    for (Component component : outputCurrencyPanel.getComponents()) {
                        if (component instanceof JRadioButton) {
                            JRadioButton radioButton = (JRadioButton) component;
                            if (radioButton.isSelected()) {
                                int index = outputCurrencyPanel.getComponentZOrder(radioButton);
                                JLabel label = (JLabel) outputCurrencyPanel.getComponent(index - 1);
                                outputCurrency = label.getText();
                                break;
                            }
                        }
                    }
                    if (inputCurrency.equals("INR") && outputCurrency.equals("USD")) {
                        outputValue = inputValue / 74.14;
                    } else if (inputCurrency.equals("INR") && outputCurrency.equals("EUR")) {
                        outputValue = inputValue / 86.67;
                    } else if (inputCurrency.equals("INR") && outputCurrency.equals("INR")) {
                        outputValue = inputValue;
                    } else if (inputCurrency.equals("USD") && outputCurrency.equals("INR")) {
                        outputValue = inputValue * 74.14;
                    } else if (inputCurrency.equals("USD") && outputCurrency.equals("USD")) {
                        outputValue = inputValue;
                    } else if (inputCurrency.equals("USD") && outputCurrency.equals("EUR")) {
                        outputValue = inputValue * 0.85;
                    } else if (inputCurrency.equals("EUR") && outputCurrency.equals("INR")) {
                        outputValue = inputValue * 86.67;
                    } else if (inputCurrency.equals("EUR") && outputCurrency.equals("USD")) {
                        outputValue = inputValue / 0.85;
                    } else if (inputCurrency.equals("EUR") && outputCurrency.equals("EUR")) {
                        outputValue = inputValue;
                    }
                    outputValueField.setText(String.format("%.2f", outputValue));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add calculate button to frame
        add(calculateButton, BorderLayout.SOUTH);

        // Set frame size and location
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set frame visible
        setVisible(true);
    }
}