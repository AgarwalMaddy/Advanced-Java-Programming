import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class CRUD2  implements ActionListener {
    private JTextField tName , tGenre;
    private JButton bCreate;
    private JButton bInsert;
    private JButton bRead;
    private JButton bUpdate;
    private JTextArea dText;

    private Statement stmt;

    CRUD2(){
        startGui();
        startDC();
    }

    private void startGui(){
        JFrame frame = new JFrame("CRUD Operation using GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,2));
        frame.setSize(500,500);

        JLabel lName = new JLabel("Enter Name");
        tName = new JTextField();

        JLabel lGenre = new JLabel("Enter Age");
        tGenre = new JTextField();

        bCreate = new JButton("CREATE");
        bInsert = new JButton("INSERT");
        bRead = new JButton("SELECT");
        bUpdate = new JButton("UPDATE");
        JButton bDelete = new JButton("DELETE");

        bCreate.addActionListener(this);
        bDelete.addActionListener(this);
        bUpdate.addActionListener(this);
        bRead.addActionListener(this);
        bInsert.addActionListener(this);

        dText = new JTextArea();
        dText.setEditable(false);

        frame.add(lName);
        frame.add(tName);
        frame.add(lGenre);
        frame.add(tGenre);
        frame.add(bCreate);
        frame.add(bDelete);
        frame.add(bInsert);
        frame.add(bRead);
        frame.add(bUpdate);
        frame.add(dText);
        frame.setVisible(true);
    }

    private void startDC(){
        String url = "jdbc:mysql://localhost:3306/Javaclass";
        String user = "root";
        String password = "123456";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    private void createTable(){
        String createQuery = "Create Table movies2 (Movie Varchar(255) , Genre Varchar(255))";
        try{
            stmt.addBatch(createQuery);
            stmt.executeBatch();
            dText.append("Table Created");
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    private void insertTable(){
        String name = tName.getText();
        String genre =tGenre.getText();

        String insertQuery = "Insert Into movies2 (Movie , Genre) Values ('" + name + "','" + genre + "')";

        try{
            stmt.addBatch(insertQuery);
            stmt.executeBatch();
            dText.append("Data Inserted");
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    private void readTable(){
        String selectQuery = "Select * from movies2";
        try{
            ResultSet rs = stmt.executeQuery(selectQuery);
            while(rs.next()){
                String mName = rs.getString("Movie");
                String mGenre = rs.getString("Genre");
                dText.append("Name: " + mName + " Genre: " + mGenre);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    private void updateTable(){
        String name = tName.getText();
        String genre = tGenre.getText();
        String updateQuery = "Update movies2 Set Genre = '" + genre + "WHERE Movie = '" + name + "'";
        try{
            stmt.addBatch(updateQuery);
            stmt.executeBatch();
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    private void deleteTable(){
        String name = tName.getText();
        String deleteQuery = "Delete From movies2 Where Movie = '" + name + "'";
        try{
            stmt.addBatch(deleteQuery);
            stmt.executeBatch();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bCreate){
            createTable();
        } else if (e.getSource() == bInsert) {
            insertTable();
        } else if (e.getSource() == bRead) {
            readTable();
        } else if (e.getSource() == bUpdate) {
            updateTable();
        } else {
            deleteTable();
        }
    }
    public static void main(String[] args) {
        new CRUD2();
    }
}
