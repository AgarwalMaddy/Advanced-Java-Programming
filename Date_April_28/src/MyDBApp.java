import java.sql.*;



public class MyDBApp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Hello");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaClass" , "root" , "123456");
            Statement stmt = null;
            stmt = conn.createStatement();

            ResultSet rs = null;
            rs = stmt.executeQuery("Select * from movies");

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);

                System.out.println("Movie Id " + id + "\t" + "Movie Name " + name);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
