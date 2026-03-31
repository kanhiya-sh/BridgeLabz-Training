package BridgeLabz_Day20_LinkedList;

public class OnlineTicketReservationLinkedList {
    public static void main(String[] args) {
        OnlineTicketReservation tickets = new OnlineTicketReservation();
        tickets.addTicket(1, "Bhavy", "Iron Man 2", "A1", "10:00");
        tickets.addTicket(2, "Naman", "Avengers EndGame", "B1", "11:00");
        tickets.addTicket(3, "Radhika", "Thor 2", "C1", "12:00");
        System.out.println("All Tickets:");
        tickets.display();
        System.out.println("Search Inception:");
        tickets.search("Inception");
        tickets.removeTicket(2);
        System.out.println("After Removal:");
        tickets.display();
        tickets.countTickets();
    }
}
