//Modeling business problems
import java.util.*;
//This class is general class
class Petrol {	
	float price = 110;
	float amount, quantity;
	void setPrice(float p) {
		price=p; 
	}
	void getPrice( ) {
		System.out.println("The price = "+price);
	}
	Petrol (){					//constructor 
		amount = 0;
		quantity =0;
		System.out.println("Amount =" +amount);
		System.out.println("Quantity ="+quantity);
	}
	void enterAmount()
	{
		System.out.println("Enter amount > 10:\n");	
		Scanner sc = new Scanner(System.in);
		amount = sc.nextFloat();
		quantity = amount / price;
		System.out.printf("Quantity dispensed: %.3f%n Pay: %.2f", quantity, amount);
		//calculation
	}
	void enterQuantity(){
		System.out.println("Enter quantity in litres:\n");
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextFloat();
		amount = quantity * price;
		System.out.printf("Quantity dispensed: %.3f%n Pay: %.2f", quantity, amount);
		//calculation
	}
}
//Boundary class
class PetrolPump {
	public static void main(String[] args) {
		String choice;
		Petrol p1 = new Petrol();
		p1.setPrice(75);
		p1.getPrice();
		System.out.println("\nEnter Quantity or Amount. enter q or a\n");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();
		switch(choice) {		//use switch case
		case "q":
			p1.enterQuantity();	
			break;
		case "a": 
			p1.enterAmount();	
			break;
	}
}
}
