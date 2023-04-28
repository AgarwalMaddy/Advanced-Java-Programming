import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert_Database {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaClass" , "root" , "1223456");
            Statement stmt = conn.createStatement();

            String query1 = "Insert Into movies values (4, 'Ajab Prem ki Gazab Kahani')";
            stmt.addBatch(query1);
            stmt.executeBatch();

            ResultSet rs = stmt.executeQuery("Select * from movies;");
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("Movie Id : " + id + "\t" + "Movie Name : " + name);
            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}
