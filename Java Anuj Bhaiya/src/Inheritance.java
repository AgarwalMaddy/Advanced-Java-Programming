import Encapsulation.Encapsulation_Intro;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        Engineer e1 = new Engineer(name , age);
        System.out.println("Name of the engineer: " + e1.name + " his age is " + e1.age);
        e1.work();
        e1.job();

        Developer d1 = new Developer(name , age);
        //It first checks it location in Developer class if not found then it looks for it in its parent.
        d1.job();

        Encapsulation_Intro obj1 = new Encapsulation_Intro();
        obj1.publiclearning();
        //obj1.defaultLearning(); // Error display: Default only works in same package.
    }
}

class Engineer {
    String name;
    int age;

    public Engineer(String name, int age){
        this.name = name;
        this.age = age;
    }

    void work(){
        System.out.println(name + " is an engineer. He gets fucks from life.");
    }
    void job(){
        System.out.println(name + " is looking for a Developer Job.");
    }
}
class Developer extends Engineer {
    public Developer(String name , int age){
        super(name, age);
    }
    void job(){
        System.out.println("Developer " + name + " is struggling to find a job.");
    }
}