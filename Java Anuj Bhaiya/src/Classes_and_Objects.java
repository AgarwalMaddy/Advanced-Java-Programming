public class Classes_and_Objects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 31;
        p1.name = "Madhur Agarwal";

        System.out.println(p1.age + p1.name);
    }

     static class Person {
        String name;
        int age;
    }
}
