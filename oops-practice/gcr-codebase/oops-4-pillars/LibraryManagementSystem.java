package BridgeLabz_Day17_4Pillars;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrowerName;
    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    // This is Encapsulation of borrower data
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
    protected String getBorrowerName() {
        return borrowerName;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    Book(String id, String title, String author) {
        super(id, title, author);
    }
    int getLoanDuration() {
        return 14;
    }
    public void reserveItem() {
        System.out.println("Book reserved");
    }
    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem implements Reservable {
    Magazine(String id, String title, String author) {
        super(id, title, author);
    }
    int getLoanDuration() {
        return 7;
    }
    public void reserveItem() {
        System.out.println("Magazine reserved");
    }
    public boolean checkAvailability() {
        return true;
    }
}

class DVD extends LibraryItem implements Reservable {
    DVD(String id, String title, String author) {
        super(id, title, author);
    }
    int getLoanDuration() {
        return 3;
    }
    public void reserveItem() {
        System.out.println("DVD reserved");
    }
    public boolean checkAvailability() {
        return true;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem l1 = new Book("L101", "Java Basics", "James");
        LibraryItem l2 = new Magazine("L102", "Tech Today", "Editor");
        LibraryItem l3 = new DVD("L103", "Learning Java", "Oracle");
        LibraryItem[] items = { l1, l2, l3 };
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("----------------------");
        }
    }
}
