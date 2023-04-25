package pkgIOSerialization;
import java.io.Serializable;

public class UserProfile implements Serializable {
  private String name;
  private String email;
  private String phone;

  public UserProfile() {
	    this.name = "Anand";
	    this.email = "anand.motwani@vitbhopal.ac.in";
	    this.phone = "8818965776";
	  }

  public UserProfile(String name, String email, String phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}