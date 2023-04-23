import java.util.Scanner;

public class Classes_and_Objects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 21;
        p1.name = "Madhur Agarwal";
        System.out.println("My name is " + p1.name + " I am  " + p1.age + " years old.");

        Person p2 = new Person("Anuj Bhaiya"  , 31);
        //Default constructor are not used here thus there is no use of below statements to assign values.
        /* p2.age = 31;
        p2.name = "Anuj Bhaiya"; */
        System.out.println("My name is " + p2.name + " I am  " + p2.age + " years old.");


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

    //Creating a new constructor with Arguments (Constructor Overloading)
    //A new constructor is created that takes two inputs and assign it to the properties of the class.
    public Person(String name , int age){
        //this() keyword is used to call other constructors of the same class.
        this();

       /* name = fullName;
        age = realAge; */

       /* Now if I had not used different variables in the argument of constructor and used the same as
          class properties variables then I have to use this() keyword to specify that it is from
          class that I am assigning it to this variable */
        this.name = name;
        this.age = age;
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
