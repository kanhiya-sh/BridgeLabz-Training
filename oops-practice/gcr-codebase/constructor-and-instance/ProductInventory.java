package constructorAndInstance;

class Product {
    // instance variables
    String productName;
    double price;

    // class variable (shared)
    static int totalProducts = 0;

    // constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increase count
    }

    // instance method
    void displayProductDetails() {
        System.out.println(productName + " " + price);
    }

    // class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mobile", 30000);
        p1.displayProductDetails();
        p2.displayProductDetails();
     // calling static method using class name
        Product.displayTotalProducts();
	}

}
