package BridgeLabz_Day22_ScenarioBased_OOPS.InventoryManagementSystem;

import java.util.*;

public class InventoryManagementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product("P101", "Laptop", 10, 50000));
        inventory.addProduct(new Product("P102", "Mouse", 4, 500));
        while (true) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add New Product");
            System.out.println("2. Add Stock (Updating the stock)");
            System.out.println("3. Sell Product (Monitor Stock)");
            System.out.println("4. View All Products");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Quantity : ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    inventory.addProduct(new Product(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter Product ID to Restock : ");
                    String restockId = sc.next();
                    System.out.print("Enter Quantity to Add : ");
                    int addQty = sc.nextInt();
                    inventory.addStock(restockId, addQty);
                    break;

                case 3:
                    System.out.print("Enter Product ID to Sell : ");
                    String sellId = sc.next();
                    System.out.print("Enter Quantity to Sell : ");
                    int sellQty = sc.nextInt();
                    try {
                        inventory.sellProduct(sellId, sellQty);
                    }
                    catch (OutOfStockException e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;

                case 4:
                    inventory.viewInventory();
                    break;

                case 5:
                    System.out.println("Exiting System...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
