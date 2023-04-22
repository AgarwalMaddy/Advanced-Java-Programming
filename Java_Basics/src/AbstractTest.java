//abstract superclass / abstract class and abstract method.
abstract class A
{
  public final void callme() {				//we cannot change its body.
	  System.out.println("Hi");
  }							
  
 abstract void hello(); 	//abstract method declared	
  void showme() {
	  System.out.println("I am non abstract method of abstract Base class");	//non-abstract method
  }
  //abstract void bye();
}
//subclass
class Abs extends A				//extends means using inheritance
{
  void hello() {
	  System.out.println("Hello I am from Abs");
  }
}
//subclass 
class Bb extends A {	
	void hello() {
		System.out.println("Hello friends.. I am from Bb");
	}
}
class Cc extends A {
	void hello() {
		System.out.println("Hello Guys.. I am from Cc");
	}
}
//Driver class
 public class AbstractTest {					
	public static void main(String[] args)
	  {
		//A a1 = new A();            //we cannot instantiate the abstract class.
		/*
		 * Abs abs = new Abs(); abs.callme(); // output=? Hi Bb b2 = new Bb();
		 * b2.callme(); // output = ? abs.showme(); //calling non-abstract method of
		 * abstract class. abs.hello(); //output = ? Bb bb = new Bb(); bb.callme();
		 * //output=? //Example of static binding bb.showme(); //output=? bb.hello(); //
		 * the method from Bb
		 */		  
		  A a1 = new Abs();
		  a1.hello();		//from Abs
		  a1 = new Bb();
		  a1.hello(); // from Bb
		  a1 = new Cc();
		  a1.hello();
	    //b.show();
	 }
}
