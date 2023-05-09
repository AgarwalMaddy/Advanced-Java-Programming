import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class DataEntryForm extends JFrame implements ActionListener {
    JLabel nameLabel, mobileLabel, addressLabel;
    JTextField nameField, mobileField, addressField;
    JButton submitButton;

    DataEntryForm() {
        // Create form components
        nameLabel = new JLabel("Name:");
        mobileLabel = new JLabel("Mobile Number:");
        addressLabel = new JLabel("Address:");
        nameField = new JTextField(20);
        mobileField = new JTextField(20);
        addressField = new JTextField(20);
        submitButton = new JButton("Submit");

        // Set layout and add components
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        add(nameLabel);
        add(nameField);
        add(mobileLabel);
        add(mobileField);
        add(addressLabel);
        add(addressField);
        add(submitButton);

        // Add action listener to submit button
        submitButton.addActionListener(this);

        // Set frame properties
        setTitle("Data Entry Form");
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Get values from form fields
            String name = nameField.getText();
            String mobile = mobileField.getText();
            String address = addressField.getText();

            // Insert data into database
            insertData(name, mobile, address);

            // Clear form fields
            nameField.setText("");
            mobileField.setText("");
            addressField.setText("");
        }
    }

    public void insertData(String name, String mobile, String address) {
        String url = "jdbc:mysql://localhost:3306/JavaClass";
        String user = "root";
        String password = "123456";

        String sql = "INSERT INTO Basic_Details (BName, Mobile, Address) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, mobile);
            pst.setString(3, address);
            pst.executeUpdate();

            System.out.println("Data inserted successfully");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new DataEntryForm();
    }
}