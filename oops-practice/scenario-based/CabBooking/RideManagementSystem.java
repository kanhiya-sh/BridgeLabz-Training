package BridgeLabz_Day19_ScenarioBased;

import java.util.*;
public class RideManagementSystem {

    static List<Driver> drivers = new ArrayList<>();
    static List<Ride> rideHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // Multiple drivers
        drivers.add(new Driver(101, "Manu"));
        drivers.add(new Driver(102, "Shantanu"));
        drivers.add(new Driver(103, "Tanu"));
        drivers.add(new Driver(104, "Dhanush"));
        drivers.add(new Driver(105, "Ravi"));
        while (true) {
            // Check if any driver is available
            if (!isAnyDriverAvailable()) {
                System.out.println(" No Driver Available. Ride not booked.");
                break;
            }
            // User input
            System.out.print("\nEnter User Id : ");
            int userId = sc.nextInt();
            System.out.print("Enter User Name : ");
            String uname = sc.next();
            System.out.print("Enter Distance in k m: ");
            double distance = sc.nextDouble();
            User user = new User(userId, uname);
            // Random Peak or Normal hour
            boolean isPeak = rand.nextBoolean();
            System.out.println(isPeak ? " Peak Hours Applied" : " Normal Hours Applied");
            try {
                bookRide(user, distance, isPeak);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        // Show ride history before exit
        viewRideHistory();
    }

    // CREATE
    public static void bookRide(User user, double distance, boolean isPeak) throws NoDriverAvailableException {
        Driver assignedDriver = null;
        for (Driver d : drivers) {
            if (d.available) {
                assignedDriver = d;
                break;
            }
        }
        if (assignedDriver == null) {
            throw new NoDriverAvailableException("No Driver Available");
        }
        FareCalculator fare; // Polymorphism
        fare = isPeak ? new PeakFare() : new NormalFare();
        double totalFare = fare.calculateFare(distance);
        assignedDriver.available = false; // UPDATE
        rideHistory.add(new Ride(user, assignedDriver, totalFare));
        System.out.println(" Ride Booked Successfully");
        System.out.println("Driver : " + assignedDriver.name);
        System.out.println("Fare : " + totalFare);
    }

    // READ
    public static void viewRideHistory() {
        System.out.println("\n Ride History:");
        for (Ride r : rideHistory) {
            System.out.println(r.user.name + " -> " + r.driver.name + " | Fare: " + r.fare);
        }
    }

    // Helper method
    public static boolean isAnyDriverAvailable() {
        for (Driver d : drivers) {
            if (d.available) {
                return true;
            }
        }
        return false;
    }
}