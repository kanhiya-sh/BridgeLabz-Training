package BridgeLabz_Day20_LinkedList;

public class InventoryManagement {
    class Node {
        int itemId;
        String itemName;
        int quantity;
        double price;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Add at Beginning
    public void addFirst(int id, String name, int qty, double price) {
        Node nn = new Node();
        nn.itemId = id;
        nn.itemName = name;
        nn.quantity = qty;
        nn.price = price;

        if (size == 0) {
            head = nn;
            tail = nn;
        }
        else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    // Add at End
    public void addLast(int id, String name, int qty, double price) {
        if (size == 0) {
            addFirst(id, name, qty, price);
        }
        else {
            Node nn = new Node();
            nn.itemId = id;
            nn.itemName = name;
            nn.quantity = qty;
            nn.price = price;

            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    // Add at Specific Position
    public void addAtIndex(int k, int id, String name, int qty, double price) throws Exception {
        if (k == 0) {
            addFirst(id, name, qty, price);
        }
        else if (k == size) {
            addLast(id, name, qty, price);
        }
        else {
            Node nn = new Node();
            nn.itemId = id;
            nn.itemName = name;
            nn.quantity = qty;
            nn.price = price;

            Node prev = getNode(k - 1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }

    // Remove by Item ID
    public void removeById(int id) {
        if (size == 0){
            return;
        }
        if (head.itemId == id) {
            head = head.next;
            size--;
            return;
        }
        Node prev = head;
        while (prev.next != null && prev.next.itemId != id) {
            prev = prev.next;
        }

        if (prev.next != null) {
            if (prev.next == tail) {
                tail = prev;
            }
            prev.next = prev.next.next;
            size--;
        }
    }

    // Update Quantity by Item ID
    public void updateQuantity(int id, int newQty) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Item ID
    public void searchById(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    public void searchByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Total Inventory Value
    public void totalInventoryValue() {
        double sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value = " + sum);
    }

    // Sort by Name (Ascending / Descending)
    public void sortByName(boolean asc) {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if ((asc && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
                        (!asc && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {
                    swapData(i, j);
                }
            }
        }
    }

    // Sort by Price (Ascending / Descending)
    public void sortByPrice(boolean asc) {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if ((asc && i.price > j.price) ||
                        (!asc && i.price < j.price)) {
                    swapData(i, j);
                }
            }
        }
    }

    private void swapData(Node a, Node b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }

    private Node getNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Index out of range");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        System.out.println("ID\tName\tQty\tPrice");
        while (temp != null) {
            System.out.println(
                    temp.itemId + "\t" +
                            temp.itemName + "\t" +
                            temp.quantity + "\t" +
                            temp.price
            );
            temp = temp.next;
        }
    }

    private void printItem(Node n) {
        System.out.println(n.itemId + "\t" + n.itemName + "\t" + n.quantity + "\t" + n.price);
    }
}
