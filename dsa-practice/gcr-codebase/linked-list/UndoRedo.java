package BridgeLabz_Day20_LinkedList;

public class UndoRedo {
    class Node {
        String text;
        Node prev;
        Node next;

        Node(String text) {
            this.text = text;
        }
    }

    private Node head;
    private Node tail;
    private Node current;
    private int size = 0;
    private final int LIMIT = 10;

    // Adding new state
    public void addState(String text) {
        Node nn = new Node(text);
        if (head == null) {
            head = tail = current = nn;
            size++;
            return;
        }

        // clearing redo history
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = countSize();
        }
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
        current = nn;
        size++;
        if (size > LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Display current state
    public void display() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        }
    }

    private int countSize() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
}
