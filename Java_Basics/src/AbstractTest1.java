//Concept of abstract class where object of abstract base class holding reference of sub-class.
abstract class Vehicle
{
   public abstract  void enginestart();         // abstract method
   void showcost(double price) {
	   System.out.println("Car price is: "+(price+10000));
   }
}
class Car extends Vehicle {
    public void enginestart()						//method overridden
    {
        System.out.println("Car engine");
        // car engine implementation
    }
}
class Bus extends Vehicle {
	public void enginestart() {
		System.out.println("Bus engine");
	}
}
public class AbstractTest1 {
	public static void main(String[] args)
    {
        //Vehicle v1 = new Vehicle();
        Vehicle v1 = new Car();
        v1.enginestart();
        v1.showcost(500000);
        
       Car c1 = new Car();
        c1.enginestart();    //static binding
        
        v1 = new Bus();
        v1.enginestart();
    }
}