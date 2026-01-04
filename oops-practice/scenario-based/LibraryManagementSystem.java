package Capgemini_Day16_ScenarioBased;

class Book {
    String title;
    String author;
    boolean available;
    Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
    void display() {
        System.out.println(title + " | " + author + " | " + (available ? "Available" : "Checked Out"));
    }
}

class Library {
    Book[] books;
    Library(Book[] books) {
        this.books = books;
    }
    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }
    void searchBook(String keyword) {
        boolean found = false;
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found : " + b.title);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found");
        }
    }
    void checkoutBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (b.available) {
                    b.available = false;
                    System.out.println("Book checked out successfully");
                }
                else {
                    System.out.println("Book is already checked out");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Programming", "James Gosling", true),
                new Book("Data Structures", "Mark Allen", true),
                new Book("Cloud Computing", "Rajkumar Buyya", false)
        };
        Library library = new Library(books);
        library.displayBooks();
        library.searchBook("Java");
        library.checkoutBook("Java Programming");
        library.displayBooks();
    }
}
