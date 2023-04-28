import java.sql.*;

public class JDBC1 {
    public static void main(String[] args)  throws SQLException , ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/world" , "root" , "123456");
            Statement stmt = conn.createStatement();

            String query1 = "Create Table Marks (ID Int(10) , Name Varchar(100), Subject1 Int(10) , Subject2 INT(10)";

            String query2 = "Insert Into Marks Values(1 , 'Madhur', 40 , 45), (2 , 'Sparsh' , 42 , 47)";

            stmt.addBatch(query1);
            stmt.addBatch(query2);

            stmt.executeBatch();
            ResultSet rs = stmt.executeQuery("Select * from Marks");
            System.out.println("Id\tName\tSubject1\tSubject2");

            while(rs.next()){
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"
                + rs.getInt(3) + "\t" + rs.getInt(4));
            }
        }
        catch (Exception e){
            System.out.println(e);

        }

    }
}
