package BridgeLabz_Day22_ScenarioBased_OOPS.FlightBookingSystem;
import java.util.*;

public class FlightBookingMain {
    // Array for Flights
    static Flight[] availableFlights = new Flight[5];
    // List for Bookings
    static List<Booking> myBookings = new ArrayList<>();
    static int bookingCounter = 1; // Auto-increment ID
    public static void main(String[] args) {
        // Initializing Array
        availableFlights[0] = new Flight(101, "Delhi", "Mumbai", 5000);
        availableFlights[1] = new Flight(102, "Mumbai", "Goa", 3000);
        availableFlights[2] = new Flight(103, "Delhi", "Bangalore", 7000);
        availableFlights[3] = new Flight(104, "Chennai", "Kolkata", 4500);
        availableFlights[4] = new Flight(105, "Jaipur", "Delhi", 2500);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Flight Booking ---");
            System.out.println("1. Search & Book Flight");
            System.out.println("2. View My Bookings");
            System.out.println("3. Edit Passenger Name");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                // --- CREATE ---
                case 1:
                    System.out.print("Enter Source : ");
                    String src = sc.next();
                    System.out.print("Enter Destination : ");
                    String dest = sc.next();

                    boolean found = false;
                    for (Flight f : availableFlights) {
                        if (f.getSource().equalsIgnoreCase(src) && f.getDestination().equalsIgnoreCase(dest)) {
                            System.out.println("Found: " + f);
                            System.out.print("Book this? (yes/no): ");
                            if (sc.next().equalsIgnoreCase("yes")) {
                                System.out.print("Enter Passenger Name: ");
                                String pname = sc.next();

                                // Create new booking object
                                myBookings.add(new Booking(bookingCounter++, pname, f));
                                System.out.println("Booking Confirmed! Your Booking ID is " + (bookingCounter-1));
                            }
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("No flights found.");
                    }
                    break;

                // --- READ ---
                case 2:
                    System.out.println("\n--- Your Bookings ---");
                    if (myBookings.isEmpty()){
                        System.out.println("No bookings yet.");
                    }
                    else {
                        for (Booking b : myBookings) {
                            System.out.println(b);
                        }
                    }
                    break;

                // --- UPDATE ---
                case 3:
                    System.out.print("Enter Booking ID to Edit: ");
                    int editId = sc.nextInt();
                    boolean foundEdit = false;
                    for (Booking b : myBookings) {
                        if (b.getBookingId() == editId) {
                            System.out.print("Enter New Passenger Name: ");
                            b.setPassengerName(sc.next()); // Setter use kiya
                            System.out.println("Name Updated!");
                            foundEdit = true;
                            break;
                        }
                    }
                    if (!foundEdit) System.out.println("Booking ID not found.");
                    break;

                // --- DELETE ---
                case 4:
                    System.out.print("Enter Booking ID to Cancel: ");
                    int cancelId = sc.nextInt();
                    boolean foundCancel = false;
                    Iterator<Booking> it = myBookings.iterator();
                    while (it.hasNext()) {
                        Booking b = it.next();
                        if (b.getBookingId() == cancelId) {
                            it.remove(); // List se remove
                            System.out.println("Booking Cancelled.");
                            foundCancel = true;
                            break;
                        }
                    }
                    if (!foundCancel) System.out.println("Booking ID not found.");
                    break;

                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}