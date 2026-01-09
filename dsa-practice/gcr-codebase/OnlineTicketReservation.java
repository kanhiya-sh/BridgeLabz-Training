package BridgeLabz_Day20_LinkedList;

public class OnlineTicketReservation {
    class Node {
        int ticketId;
        String customer;
        String movie;
        String seat;
        String time;
        Node next;

        Node(int id, String customer, String movie, String seat, String time) {
            this.ticketId = id;
            this.customer = customer;
            this.movie = movie;
            this.seat = seat;
            this.time = time;
        }
    }

    private Node head;
    private int size = 0;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie, String seat, String time) {
        Node nn = new Node(id, customer, movie, seat, time);
        if (head == null) {
            head = nn;
            nn.next = head;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = head;
        }
        size++;
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (head == null) return;
        if (head.ticketId == id) {
            if (head.next == head) {
                head = null;
            }
            else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            size--;
            return;
        }
        Node curr = head;
        while (curr.next != head && curr.next.ticketId != id) {
            curr = curr.next;
        }
        if (curr.next.ticketId == id) {
            curr.next = curr.next.next;
            size--;
        }
    }

    // Display tickets
    public void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.println(
                    temp.ticketId + "\t" +
                            temp.customer + "\t" +
                            temp.movie + "\t" +
                            temp.seat + "\t" +
                            temp.time
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer or movie
    public void search(String key) {
        if (head == null) return;
        Node temp = head;
        do {
            if (temp.customer.equalsIgnoreCase(key) ||
                    temp.movie.equalsIgnoreCase(key)) {
                System.out.println(
                        temp.ticketId + "\t" +
                                temp.customer + "\t" +
                                temp.movie + "\t" +
                                temp.seat + "\t" +
                                temp.time
                );
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Count tickets
    public void countTickets() {
        System.out.println("Total Tickets: " + size);
    }
}
