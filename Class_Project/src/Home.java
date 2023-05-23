import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Home extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JComboBox cb1;
    JRadioButton rb1, rb2, rb3;
    ButtonGroup bg1;
    JTextField tf1;
    JRadioButton rb4, rb5;
    ButtonGroup bg2;
    JButton btn1;
    Connection con;
    Statement st;

    Home() {
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2));
        l1 = new JLabel("Select Movie");
        String[] movies = {"Kerala Story", "Fast X", "IB71"};
        cb1 = new JComboBox(movies);
        l2 = new JLabel("Select Date");
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        rb1 = new JRadioButton(date.format(formatter));
        rb2 = new JRadioButton(date.plusDays(1).format(formatter));
        rb3 = new JRadioButton(date.plusDays(2).format(formatter));
        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);
        l3 = new JLabel("Enter Number of Seats");
        tf1 = new JTextField(15);
        rb4 = new JRadioButton("Standard");
        rb5 = new JRadioButton("Premium");
        bg2 = new ButtonGroup();
        bg2.add(rb4);
        bg2.add(rb5);
        btn1 = new JButton("Book Ticket");

        p1.add(l1);
        p1.add(cb1);
        p1.add(l2);
        p1.add(rb1);
        p1.add(new JLabel(""));
        p1.add(rb2);
        p1.add(new JLabel(""));
        p1.add(rb3);
        p1.add(l3);
        p1.add(tf1);
        p1.add(rb4);
        p1.add(rb5);

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
                String movie = (String) cb1.getSelectedItem();
                String date = "";
                if (rb1.isSelected()) {
                    date = rb1.getText();
                } else if (rb2.isSelected()) {
                    date = rb2.getText();
                } else if (rb3.isSelected()) {
                    date = rb3.getText();
                }
                String seats = tf1.getText();
                String category = "";
                if (rb4.isSelected()) {
                    category = "Standard";
                } else if (rb5.isSelected()) {
                    category = "Premium";
                }

                if (movie.equals("") || date.equals("") || seats.equals("") || category.equals("")) {
                    JOptionPane.showMessageDialog(null, "All fields are mandatory!");
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "123456");
                    st = con.createStatement();
                    String sql = "INSERT INTO movieticket(Name,Date,Seat,category) VALUES('" + movie + "','" + date + "','" + seats + "','" + category + "')";
                    st.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "Ticket Booked Successfully!");
                    System.out.println("Ticket Booked Successfully!");
                    dispose();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}