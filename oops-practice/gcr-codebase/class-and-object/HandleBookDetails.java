package Capgemini_Day12_class_object;

class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) { // Constructor to initialize book details
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() { // Method to display book details
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }
}

public class HandleBookDetails {
    public static void main(String[] args) {
        Book book1 = new Book("2States", "Chetan Bhagat", 500);
        Book book2 = new Book("Wings Of Fire", "Abdul kalam.A.P.J", 500);

        book1.display();
        System.out.println();
        book2.display();
    }
}
