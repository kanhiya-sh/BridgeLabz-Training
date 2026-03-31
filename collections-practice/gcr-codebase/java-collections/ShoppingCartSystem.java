package BridgeLabz_Day30_Collections;

import java.util.*;
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Map<String,Integer> priceMap = new HashMap<>();
        priceMap.put("Laptop",70000);
        priceMap.put("Phone",30000);
        priceMap.put("Headphones",2000);
        Map<String,Integer> cartOrder = new LinkedHashMap<>(priceMap);
        TreeMap<Integer,String> sortedByPrice = new TreeMap<>();
        for (String item : priceMap.keySet()) {
            sortedByPrice.put(priceMap.get(item), item);
        }
        System.out.println("Cart Order: " + cartOrder);
        System.out.println("Sorted by Price: " + sortedByPrice);
    }
}
