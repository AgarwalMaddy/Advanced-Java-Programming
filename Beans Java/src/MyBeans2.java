import javax.swing.*;
import java.awt.*;

public class MyBeans2 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyBeans mb = new MyBeans();
        frame.add(mb);
        frame.setLocationRelativeTo(null);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
