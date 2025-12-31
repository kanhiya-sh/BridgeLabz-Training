package constructorAndInstance;

class Books {

	public String ISBN;     
	protected String title;    
	private String author;     

	// setter
	public void setAuthor(String author) {
		this.author = author;
	}

	// getter
	public String getAuthor() {
		return author;
	}
}

// this is the subclass
class EBook extends Books {
	void displayBookInfo() {
		// accessing public and protected members
		System.out.println("ISBN: " + ISBN);
		System.out.println("Title: " + title);
	}
}


public class BookLibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook eb = new EBook();
		eb.ISBN = "ISBN12345";
		eb.title = "Java Programming";
		eb.setAuthor("James Gosling");
		eb.displayBookInfo();
		System.out.println("Author: " + eb.getAuthor());
	}

}
