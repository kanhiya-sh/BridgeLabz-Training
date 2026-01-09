package BridgeLabz_Day20_LinkedList;

public class LibraryManagementSystem {
    class Node {
        String title;
        String author;
        String genre;
        int bookId;
        boolean available;

        Node next;
        Node prev;

        Node(String title, String author, String genre, int bookId, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.available = available;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Add at Beginning
    public void addFirst(String title, String author, String genre, int id, boolean available) {
        Node nn = new Node(title, author, genre, id, available);
        if (size == 0) {
            head = tail = nn;
        }
        else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        size++;
    }

    // Add at End
    public void addLast(String title, String author, String genre, int id, boolean available) {
        if (size == 0) {
            addFirst(title, author, genre, id, available);
            return;
        }
        Node nn = new Node(title, author, genre, id, available);
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
        size++;
    }

    // Add at Specific Position
    public void addAtIndex(int index, String title, String author, String genre, int id, boolean available) throws Exception {
        if (index == 0) {
            addFirst(title, author, genre, id, available);
        }
        else if (index == size) {
            addLast(title, author, genre, id, available);
        }
        else {
            if (index < 0 || index > size)
                throw new Exception("Invalid Index");
            Node curr = getNode(index);
            Node nn = new Node(title, author, genre, id, available);
            nn.prev = curr.prev;
            nn.next = curr;
            curr.prev.next = nn;
            curr.prev = nn;
            size++;
        }
    }

    // Remove by Book ID
    public void removeById(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                size--;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Title
    public void searchByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by Author
    public void searchByAuthor(String author) {
        Node temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBook(temp);
            }
            temp = temp.next;
        }
    }

    // Update Availability
    public void updateAvailability(int id, boolean status) {
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    // Display Forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count Books
    public void countBooks() {
        System.out.println("Total Books: " + size);
    }

    private Node getNode(int index) throws Exception {
        if (index < 0 || index >= size)
            throw new Exception("Invalid Index");

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private void printBook(Node b) {
        System.out.println(
                b.bookId + "\t" +
                        b.title + "\t" +
                        b.author + "\t" +
                        b.genre + "\t" +
                        (b.available ? "Available" : "Not Available")
        );
    }
}
