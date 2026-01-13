package BridgeLabz_Day22_ScenarioBased_OOPS.InventoryManagementSystem;

import java.util.ArrayList;

class OutOfStockException extends Exception {
    public OutOfStockException (String message) {
        super(message);
    }
}

// interface
interface AlertService {
    void sendLowStockAlert(String productName, int currentQuantity);
}

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product (String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void addQuantity(int qty) {
        this.quantity += qty;
    }
    public void reduceQuantity(int qty) {
        this.quantity -= qty;
    }
    @Override
    public String toString() {
        return "ID: " + productId + " | Name: " + productName + " | Qty: " + quantity + " | Price: Rs." + price;
    }
}
class Inventory implements AlertService {
    private ArrayList<Product> products; // Simple List
    public Inventory() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product p) {
        products.add(p);
        System.out.println(p.getProductName() + " added to inventory.");
    }
    // update stock
    public void addStock(String prodId, int qty) {
        Product p = findProduct(prodId);
        if (p != null) {
            p.addQuantity(qty);
            System.out.println("Stock updated! New Quantity: " + p.getQuantity());
        } else {
            System.out.println("Product not found!");
        }
    }
    public void sellProduct(String prodId, int qty) throws OutOfStockException {
        Product p = findProduct(prodId);

        if (p != null) {
            // Check: Agar stock kam hai demand se
            if (p.getQuantity() < qty) {
                throw new OutOfStockException("Not enough stock for " + p.getProductName() + ". Available: " + p.getQuantity());
            }
            // Reduce stock
            p.reduceQuantity(qty);
            System.out.println("Sold " + qty + " units of " + p.getProductName());
            if (p.getQuantity() < 5) {
                sendLowStockAlert(p.getProductName(), p.getQuantity());
            }
        }
        else {
            System.out.println("Product not found!");
        }
    }

    public Product findProduct(String prodId) {
        for (Product p : products) {
            if (p.getProductId().equalsIgnoreCase(prodId)) {
                return p;
            }
        }
        return null;
    }

    public void viewInventory() {
        System.out.println("\n--- Current Inventory ---");
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
        System.out.println("-------------------------");
    }

    // Interface Method Implementation
    @Override
    public void sendLowStockAlert(String productName, int currentQuantity) {
        System.out.println("ALERT: Stock is running low for " + productName + "! Only " + currentQuantity + " left.");
    }
}
