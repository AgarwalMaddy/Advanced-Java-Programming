import java.util.Scanner;

public class Classes_and_Objects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 21;
        p1.name = "Madhur Agarwal";
        System.out.println(p1.name + " is " + p1.age + " years old.");

        Person p2 = new Person("Anuj Bhaiya"  , 31);
        //Default constructor are not used here thus there is no use of below statements to assign values.
        /* p2.age = 31;
        p2.name = "Anuj Bhaiya"; */
        System.out.println(p2.name + " is " + p2.age + " years old.");


        int totalPersons = Person.count;
        System.out.println("Total number of persons created using Person class : " + totalPersons);

        System.out.println("Below are all the methods/functions of different persons.");
        p1.eat();
        p2.walk();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps : ");
        int steps = sc.nextInt();
        p2.walk(steps);
    }
}
class Person {
    //Properties of Person Class
    String name;
    int age;
    //Creating the properties of the class
    static int count;

    //Defining the default constructor
    public Person(){
        count++;
        System.out.println("I am a new Person.");
    }

    //Creating a new constructor with Arguements
    //A new constructor is created that takes two inputs and assign it to the properties of the class.
    public Person(String fullName , int realAge){
        name = fullName;
        age = realAge;
    }
    //These are the methods/functions or properties for the objects(the persons that are created using the class).
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
