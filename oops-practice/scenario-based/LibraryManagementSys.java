package BridgeLabz_Day18_ScenarioBased;

import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}
class Book {
    String title;
    String author;
    boolean available;

    Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
}
public class LibraryManagementSys {
    static ArrayList<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        loadBooks();
        displayBooks();
        searchBook("java");
        try {
            checkoutBook("Python Guide");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            checkoutBook("Cloud Computing");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        displayBooks();
    }
    public static void loadBooks() {
        Book[] books = {
                new Book("Java Basics", "James", true),
                new Book("Python Guide", "Guido", false),
                new Book("Cloud Computing", "IBM", true)
        };
        for (Book b : books) {
            bookList.add(b);
        }
    }
    public static void displayBooks() {
        System.out.println("----- Library Books -----");
        for (Book b : bookList) {
            System.out.println(b.title + " | " + b.author + " | " + (b.available ? "Available" : "Checked Out"));
        }
    }
    public static void searchBook(String keyword) {
        System.out.println("Search Results :");
        for (Book b : bookList) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " by " + b.author);
            }
        }
    }
    public static void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : bookList) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available) {
                    throw new BookNotAvailableException("Book is not available");
                }
                b.available = false;
                System.out.println("Book checked out : " + b.title);
                return;
            }
        }
        System.out.println("Book not found");
    }
}
