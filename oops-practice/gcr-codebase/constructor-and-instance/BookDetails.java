package constructorAndInstance;

class Book {
	String title;
	String author;
	double price;
	
//	default constructor 
	Book(){
		title = "";
		author = "";
		price = 0.0;
	}
//	parameterized constructor
	Book(String title, String author, double price) {
		this.title = title;
        this.author = author;
        this.price = price;
	}
}

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
