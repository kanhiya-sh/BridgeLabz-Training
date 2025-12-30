package Capgemini_Day12_class_object;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayItem() {
        System.out.println(
                "Item: " + itemName +
                        ", Price: $" + price +
                        ", Quantity: " + quantity
        );
    }

    void addItem(int q) {
        quantity += q;
        System.out.println("Added " + q + " of " + itemName + " to the cart.");
    }

    void removeItem(int q) {
        quantity -= q;
        System.out.println("Removed " + q + " of " + itemName + " from the cart.");
    }

    void totalCost() {
        System.out.println("Total cost: $" + (price * quantity));
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        CartItem cart = new CartItem("Laptop", 999.99, 1);

        cart.displayItem();
        cart.addItem(2);
        cart.removeItem(1);
        cart.totalCost();
    }
}
