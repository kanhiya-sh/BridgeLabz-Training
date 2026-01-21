package BridgeLabz_Day29_Generics.SmartWarehouse;

import java.util.*;
public class WarehouseMain {
    public static void main(String[] args) {
        List<WarehouseItem> ll = new ArrayList<>();
        ll.add(new Electronics("Laptop"));
        ll.add(new Groceries("Rice"));
        ll.add(new Furniture("Chair"));
        display(ll);
    }
    public static void display(List<? extends WarehouseItem> ll) {
        for (WarehouseItem i : ll) {
            i.show();
        }
    }
}