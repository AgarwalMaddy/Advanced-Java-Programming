import java.util.Scanner;

public class Classes_and_Objects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 21;
        p1.name = "Madhur Agarwal";

        Person p2 = new Person();
        p2.age = 31;
        p2.name = "Anuj Bhaiya";

        System.out.println(p1.name + " is " + p1.age + " years old.");
        System.out.println(p2.name + " is " + p2.age + " years old.");

        p1.eat();
        p2.walk();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps : ");
        int steps = sc.nextInt();
        p2.walk(steps);
    }
}
class Person {
    //Properties of Person
    String name;
    int age;

    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    
    void walk(int steps){
        System.out.println(name + " has walked " + steps + " steps.");
    }
}
