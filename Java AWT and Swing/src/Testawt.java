
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class Testawt
{
  Testawt()
  {
	JFrame fm=new JFrame();    //Creating a frame
    Button btn=new Button("Hello World");
    Label lb = new Label("welcome to java graphics"); 
    fm.add(btn);
    fm.add(lb);                  //adding label to the frame
    fm.setSize(300, 300);   //setting frame size.
    fm.setLayout(new FlowLayout());	 //set default layout for frame.
    fm.setVisible(true);     //set frame visibilty 
    fm.setBackground(Color.red);
    fm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
  public static void main(String args[])
  {
    Testawt ta = new Testawt();
  }
}
