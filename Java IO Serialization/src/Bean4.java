import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Bean4 {
  public static void main(String[] args) {
    try {
      FileInputStream fileIn = new FileInputStream("userprofile.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      UserProfile userProfile = (UserProfile) in.readObject();
      in.close();
      fileIn.close();
      System.out.println("Deserialized data is:");
      System.out.println("Name: " + userProfile.getName());
      System.out.println("Email: " + userProfile.getEmail());
      System.out.println("Phone: " + userProfile.getPhone());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
