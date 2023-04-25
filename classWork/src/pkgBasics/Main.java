// Animal.java
package pkgBasics;
public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
    public String getName() {
        return name;
    }
}

// Dog.java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Bark!");
    }
}

// Cat.java
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Rufus");
        Animal animal2 = new Cat("Whiskers");
        Animal animal3 = new Animal("Unknown") {
            public void makeSound() {
                System.out.println("Generic animal sound!");
            }
        };

        printAnimal(animal1);
        printAnimal(animal2);
        printAnimal(animal3);
    }

    public static void printAnimal(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("Bark! " + dog.getName() + " barked.");
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Meow! " + cat.getName() + " meowed.");
        } else {
            System.out.println(animal.getName() + " made a generic animal sound!");
        }
    }
}
