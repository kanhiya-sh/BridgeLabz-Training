package BridgeLabz_Day20_LinkedList;

public class InventoryManagementLinkedList {
    public static void main(String[] args) throws Exception {
        InventoryManagement inv = new InventoryManagement();
        inv.addFirst(101, "Pen", 50, 10);
        inv.addLast(102, "Notebook", 20, 50);
        inv.addAtIndex(1, 103, "Pencil", 100, 5);

        inv.display();

        inv.updateQuantity(101, 60);
        inv.removeById(102);
        System.out.println("After Operations:");

        inv.display();

        inv.searchById(103);
        inv.searchByName("Pen");
        inv.totalInventoryValue();
        System.out.println("Sorted by Name : ");
        inv.sortByName(true);
        inv.display();

        System.out.println("Sorted by Price : ");
        inv.sortByPrice(false);
        inv.display();
    }
}
