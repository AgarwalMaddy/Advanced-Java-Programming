//This program is to explain the concept of Checked exception.
import java.io.*;
class CheckedException { 
   public static void main(String args[])
   {	   
			try {
		   FileInputStream fis = null;
            /*The constructor FileInputStream(File filename)
            * throws a checked exception FileNotFoundException */
	   		int k;	 
	   		
	   		fis = new FileInputStream("G:/java1.txt");
            /* Method read() of FileInputStream class throws
            * a checked exception: IOException
            */ 
	   		
			while(( k = fis.read() ) !=-1)
				{
				                System.out.print((char)k);
				}
	   		
     /*The method close() closes the file input stream
            * throws IOException*/
			fis.close();
			}
			catch(FileNotFoundException f) {
	  			System.out.println("File not found in specified folder.");
			}
		   		System.out.println("Good Bye");
	   		
   }
}