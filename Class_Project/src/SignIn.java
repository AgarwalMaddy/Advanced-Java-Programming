import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignIn extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JButton btn1;
    Connection con;
    Statement st;

    SignIn() {
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2));
        l1 = new JLabel("Name of Person");
        tf1 = new JTextField(15);
        l2 = new JLabel("Email Id of person");
        tf2 = new JTextField(15);
        l3 = new JLabel("Password");
        tf3 = new JPasswordField(15);
        l4 = new JLabel("Confirm Password");
        tf4 = new JPasswordField(15);
        l5 = new JLabel("Mobile Number");
        tf5 = new JTextField(15);
        btn1 = new JButton("Submit");

        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);
        p1.add(l4);
        p1.add(tf4);
        p1.add(l5);
        p1.add(tf5);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(btn1);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        btn1.addActionListener(this);

        setVisible(true);
        setSize(400, 250);
        setLocation(200, 200);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            try {
                String name = tf1.getText();
                String email = tf2.getText();
                String pass = tf3.getText();
                String cpass = tf4.getText();
                String mob = tf5.getText();

                if (name.equals("") || email.equals("") || pass.equals("") || cpass.equals("") || mob.equals("")) {
                    JOptionPane.showMessageDialog(null, "All fields are mandatory!");
                } else if (!pass.equals(cpass)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match!");
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "123456");
                    st = con.createStatement();
                    String sql = "INSERT INTO User(Name,Email,Password,Mobile) VALUES('" + name + "','" + email + "','" + pass + "','" + mob + "')";
                    st.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "Successfully Registered!");
                    System.out.println("Successfully Registered!");
                    dispose();
                    new Home();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new SignIn();
    }
}