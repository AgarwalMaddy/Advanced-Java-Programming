class Demon implements Runnable {

	public void run() {
		System.out.println("I am Thread Demo and I am running...");
	}

}
class ThreadDemo{
public static void main(String[] args) {
	
	
	Demon t1 = new Demon();
	t1.run();
}
}