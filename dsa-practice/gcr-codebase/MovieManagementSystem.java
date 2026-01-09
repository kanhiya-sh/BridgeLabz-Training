package BridgeLabz_Day20_LinkedList;

public class MovieManagementSystem {

    class Node {
        String title;
        String director;
        int year;
        double rating;

        Node next;
        Node prev;
    }

    private Node head;
    private Node tail;
    private int size;

    // Add at Beginning
    public void addFirst(String title, String director, int year, double rating) {
        Node nn = new Node();
        nn.title = title;
        nn.director = director;
        nn.year = year;
        nn.rating = rating;
        if (size == 0) {
            head = nn;
            tail = nn;
        }
        else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        size++;
    }

    // Add at End
    public void addLast(String title, String director, int year, double rating) {
        if (size == 0) {
            addFirst(title, director, year, rating);
        }
        else {
            Node nn = new Node();
            nn.title = title;
            nn.director = director;
            nn.year = year;
            nn.rating = rating;

            tail.next = nn;
            nn.prev = tail;
            tail = nn;
            size++;
        }
    }

    // Add at Specific Position
    public void addAtIndex(int k, String title, String director, int year, double rating) throws Exception {
        if (k == 0) {
            addFirst(title, director, year, rating);
        }
        else if (k == size) {
            addLast(title, director, year, rating);
        }
        else {
            Node curr = getNode(k);
            Node nn = new Node();

            nn.title = title;
            nn.director = director;
            nn.year = year;
            nn.rating = rating;

            nn.prev = curr.prev;
            nn.next = curr;
            curr.prev.next = nn;
            curr.prev = nn;
            size++;
        }
    }

    // Removing by Movie Title
    public void removeByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
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

    // Searching by using Director
    public void searchByDirector(String director) {
        Node temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
            }
            temp = temp.next;
        }
    }

    // Searching by Rating
    public void searchByRating(double rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                printMovie(temp);
            }
            temp = temp.next;
        }
    }

    // Updating Rating by Movie Title
    public void updateRating(String title, double newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    // Display Forward
    public void displayForward() {
        Node temp = head;
        System.out.println("Movies in forward : ");
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        Node temp = tail;
        System.out.println("Movies in reverse : ");
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
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

    private void printMovie(Node m) {
        System.out.println(m.title + "\t" + m.director + "\t" + m.year + "\t" + m.rating);
    }
}
