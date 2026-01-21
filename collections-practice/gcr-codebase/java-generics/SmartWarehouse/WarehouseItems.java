package BridgeLabz_Day29_Generics.SmartWarehouse;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    void show() {
        System.out.println(name);
    }
}
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}
class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}
class Storage<T extends WarehouseItem> {
    T item;
    void add(T item) {
        this.item = item;
    }
    T get() {
        return item;
    }
}