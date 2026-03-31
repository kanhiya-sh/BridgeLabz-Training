package constructorAndInstance;

class LibraryBook {
	
    String title;
    String author;
    double price;
    boolean available = true; // taking this to check book availability

    // method to borrow a book
    void borrowBook() {
        if (available) {
            available = false; // means if book is available than it is borrowed and than becomes unavailable 
        }
    }
} 

public class LibraryBookSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
