import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIComponentExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // JPanel with GridLayout
        JPanel panel = new JPanel(new GridLayout(4, 2));

        // JButton
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        // JTextField
        JTextField textField = new JTextField();

        // JTextArea
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // JLabel
        JLabel label = new JLabel("Select an option:");

        // JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Check me");

        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        // JMenuBar and JMenu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);

        // JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel tab1 = new JPanel();
        JPanel tab2 = new JPanel();
        tabbedPane.addTab("Tab 1", tab1);
        tabbedPane.addTab("Tab 2", tab2);

        // Adding components to the panel
        panel.add(button);
        panel.add(textField);
        panel.add(scrollPane);
        panel.add(label);
        panel.add(comboBox);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);

        // Adding components to the frame
        frame.setJMenuBar(menuBar);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(tabbedPane, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}