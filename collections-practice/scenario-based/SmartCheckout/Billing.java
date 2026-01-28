package BridgeLabz_Day33_ScenarioBased.SmartCheckout;

import java.util.*;
class Customer {
    String name;
    String[] items;

    Customer(String name, String[] items) {
        this.name = name;
        this.items = items;
    }
}
class CheckoutCounter {
    Queue<Customer> queue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();
    CheckoutCounter() {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Rice", 60);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Rice", 5);
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.name + " added to queue");
    }

    public void processNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }
        Customer customer = queue.poll();
        int totalBill = 0;
        System.out.println("Processing customer : " + customer.name);
        for (String item : customer.items) {
            if (stockMap.get(item) > 0) {
                totalBill += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            }
            else {
                System.out.println(item + " out of Stock");
            }
        }

        System.out.println("Total Bill : Rs" + totalBill);
        System.out.println("--------");
    }
}
