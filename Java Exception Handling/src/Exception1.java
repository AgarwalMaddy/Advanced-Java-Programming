import java.io.IOException;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;
import java.util.Scanner;
class Exception1 {
	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		int z = 0;
		//System.out.println("Output = "+c);
		try {	
		int x = s.nextInt();
		int y = s.nextInt();
		z = x/y;    //these operation actually throws an exception object.
		}
		catch(ArithmeticException e) {
			System.out.println("/ by zero is not allowed. Something went wrong");
		}
		catch (InputMismatchException m) {
			System.out.println("Enter correct inputs please.");
		}
		finally {	
		System.out.println("This will be executed besides exception.");
		System.out.println("Output = "+z);
		}
		System.out.print("Hello, This will run if exceptions are handled properly.");     // run upto here
	} 
}
