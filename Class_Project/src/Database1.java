import java.sql.*;
// Notice , do not import java.sql.cj.jdbc.*
// Errors will occur
public class Database1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            // The newInstance() call is awork around for some.
            // broken Java Implementations
            Class.forName("com.mysql.jdbc.Driver"); // Step 0 . Load Drivers

            // 1. Establish Connection
            String conn_string = "jdbc:mysql://localhost:3306/movies?" + "user=root&password=123456";
            //test = Database Name

            conn = DriverManager.getConnection(conn_string);  //establish connection
            //Do something with the Connection

            stmt = conn.createStatement();
            rs = stmt.executeQuery("Select * from movie_review");
        }
        catch (SQLException ex){
            System.out.println("SQL Exception: " + ex.getMessage());
            System.out.println("SQL State: " + ex.getSQLState());
            System.out.println("Vendor Error: " + ex.getErrorCode());
        }
        finally {
            if(rs != null && stmt != null){
                rs.close();
                stmt.close();

                rs = null;
                stmt = null;
            }
            conn.close();
        }

    }
}
