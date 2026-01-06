package BridgeLabz_Day17_4Pillars;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    abstract double calculateTotalPrice(); // abstract method

    void getItemDetails() { // concrete method
        System.out.println("Item Name : " + itemName);
        System.out.println("Total Price : " + price);
        System.out.println("Quantity : " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }
    public String getDiscountDetails() {
        return "10% discount on Veg Item";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
    public String getDiscountDetails() {
        return "5% discount on Non-Veg Item";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Kathi Roll", 120, 2);
        FoodItem f2 = new NonVegItem("Chicken Burger", 180, 1);
        FoodItem[] order = { f1, f2 };
        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("----------------------");
        }
    }
}
