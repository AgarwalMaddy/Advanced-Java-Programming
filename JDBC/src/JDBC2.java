import java.sql.*;

public class JDBC2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the MySQL database
            String conn_string = "jdbc:mysql://localhost/movies";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(conn_string, user, password);

            // Create a statement and execute a SELECT query
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM students");

            // Iterate through the result set and print the data
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(name + ", " + age);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Could not find database driver class: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("SQLVendorError: " + ex.getErrorCode());
        } finally {
            // Close the result set, statement, and connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error while closing database resources: " + ex.getMessage());
            }
        }
    }
}