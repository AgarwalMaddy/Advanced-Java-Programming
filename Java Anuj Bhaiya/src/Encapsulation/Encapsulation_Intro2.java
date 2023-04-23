package Encapsulation;

public class Encapsulation_Intro2 {
    public static void main(String[] args) {
        Encapsulation_Intro obj1 = new Encapsulation_Intro();
        //obj1.privateLearning() displays error: Private only works within same file.
        obj1.publiclearning();
        obj1.protectedLearning();

    }
}
