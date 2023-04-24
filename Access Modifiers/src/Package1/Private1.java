package Package1;

public class Private1 {
    private void display(){
        System.out.println("Hello, testing for the private access modifiers.");
    }
    public static void main(String[] args) {
     Private1 p1 = new Private1();
     p1.display();
    }
}
/* class B {
    private void display(){
        System.out.println("Hello , Testing for the Private access modifiers.");
    }
} */
