package Encapsulation;

public class Encapsulation_Intro {
    public static void main(String[] args) {
        Encapsulation_Intro obj1 = new Encapsulation_Intro();
        obj1.privateLearning();

        Child c1 = new Child();
        c1.protectedLearning(); //Protected method thus can be used in Child Class.
    }

    public void publiclearning(){
        System.out.println("Test Public Access Modifier and it's working.");
    }
    private void privateLearning(){
        System.out.println("Testing Private Access Modifiers and it's working.");
    }

    protected void protectedLearning(){
        System.out.println("Testing Protected Access Modifiers and it's working.");
    }

    void defaultLearning(){
        System.out.println("Testing default Access Modifiers and it's working.");
    }
}
class Child extends Encapsulation_Intro{
    //Implementing the Protected Access Modifiers
}