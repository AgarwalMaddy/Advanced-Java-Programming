package pkgIOSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Bean3 {
  public static void main(String[] args) {
    try {
      
    //UserProfile userProfile = new UserProfile("John Smith", "john.smith@example.com", "555-1234");
    UserProfile userProfile = new UserProfile();
    
      FileOutputStream fileOut = new FileOutputStream("userprofile.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(userProfile);
      out.close();
      fileOut.close();
      System.out.println("Serialized data is saved in userprofile.ser");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
