package Encapsulation;

public class Encapsulation_Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Harry Potter");
        book1.setPrice(300);

        System.out.println(book1.getName() + book1.getPrice());
    }
}

class Book {
    String name;
    int price;

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
