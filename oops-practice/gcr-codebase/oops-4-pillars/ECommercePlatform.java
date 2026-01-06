package BridgeLabz_Day17_4Pillars;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private int price;

    Product (String productId , String name, int price ) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public String getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    abstract double calculateDiscount();
    double calculateTax() {
        return 0;
    }
    void displayFinalPrice() {
        double finalPrice = price + calculateTax() - calculateDiscount();
        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + name);
        System.out.println("Base Price : " + price);
        System.out.println("Discount : " + calculateDiscount());
        System.out.println("Tax : " + calculateTax());
        System.out.println("Final Price : " + finalPrice);
        System.out.println("---------------------------");
    }
}
class Electronics extends Product implements Taxable {
    Electronics(String id, String name, int price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return getPrice() * 0.10;
    }
    public double calculateTax() {
        return getPrice() * 0.18;
    }
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    Clothing(String id, String name, int price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return getPrice() * 0.20;
    }
    public double calculateTax() {
        return getPrice() * 0.05;
    }
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Groceries extends Product {
    Groceries(String id, String name, int price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Electronics("Prod101", "I-Phone", 150000);
        Product p2 = new Clothing("Prod102", "T-Shirt", 2000);
        Product p3 = new Groceries("Prod103", "Rice", 1200);
        Product[] products = { p1, p2, p3 };
        for (Product p : products) {
            p.displayFinalPrice();
        }
    }
}
