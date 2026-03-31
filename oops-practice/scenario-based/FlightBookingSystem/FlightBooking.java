package BridgeLabz_Day22_ScenarioBased_OOPS.FlightBookingSystem;
import java.util.*;

class Flight {
    private int flightId;
    private String source;
    private String destination;
    private double price;

    public Flight(int flightId, String source, String destination, double price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public int getFlightId() { return flightId; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "[" + flightId + "] " + source + " -> " + destination + " ($" + price + ")";
    }
}

class Booking {
    private int bookingId;
    private String passengerName;
    private Flight flight;

    public Booking(int bookingId, String passengerName, Flight flight) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.flight = flight;
    }

    // Getters
    public int getBookingId() { return bookingId; }
    public String getPassengerName() { return passengerName; }

    // Setter for Update
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    @Override
    public String toString() {
        return "Booking ID: " + bookingId + " | Passenger: " + passengerName + " | Flight: " + flight.toString();
    }
}