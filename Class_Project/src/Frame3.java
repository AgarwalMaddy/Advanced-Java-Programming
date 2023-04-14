import javax.swing.*;
import java.awt.*;

public class Frame3 extends JFrame {
    JLabel projectLabel, label1, label2, label3, value1, value2, value3;

    public Frame3(String text1, String text2, String text3) {
        super("Frame 3");
        setLayout(new GridLayout(6, 2));

        projectLabel = new JLabel("Project Heading");
        add(projectLabel);

        add(new JLabel());

        label1 = new JLabel("Text Field 1");
        add(label1);

        value1 = new JLabel(text1);
        add(value1);

        label2 = new JLabel("Text Field 2");
        add(label2);

        value2 = new JLabel(text2);
        add(value2);

        label3 = new JLabel("Text Field 3");
        add(label3);

    }}
