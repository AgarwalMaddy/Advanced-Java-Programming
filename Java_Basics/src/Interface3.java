//Program to demonstrate interface and multiple inheritance
interface Animal {
	float speed = 20; //static final public
	void sound(); // no implementation / the methods don't have bodies 
	void speed(); // by default interface methods are abstract and public //interface cannot contain constructor
}
interface FastAnimal {
	void run();
}
class Tiger implements Animal, FastAnimal {
	public void sound () {
		System.out.println("Roar");             //it is compulsory to override all the methods.
	}
	public void speed() {
		System.out.println("Tiger's Speed is 30-50 Km/h");
	}
	public void run() {
		System.out.println("I am a fast Animal");
	}
}
class Dog implements Animal {
	public void sound() {
		System.out.println("Bark");
	}
	public void speed() {
		System.out.println("Dog's Speed is 15-20 Km/h");
	}
}
//Driver class
class Interface3 {
	public static void main(String[] args) {
		
		Tiger t1 = new Tiger();
		t1.speed();
		t1.run();	
		//Animal a = new Animal(); //not valid
		//FastAnimal f = new FastAnimal(); //not valid
		Animal a = new Tiger(); // reference variable valid where you can assign the object reference 
		a.sound();
		a = new Dog();
		a.sound();					
	}
}
