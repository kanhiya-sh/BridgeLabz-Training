package Capgemini_Day12_class_object;

class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;
    private boolean booked = false;

    void displayTicketDetails() {
        if (!booked) {
            System.out.println("Ticket have not booked yet....");
        }
        else {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    void bookTicket(String movieName, String seatNumber, double price) {
        if (booked) {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
        else {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            booked = true;

            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        }
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.displayTicketDetails();
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.displayTicketDetails();
    }
}
