package BridgeLabz_Day17_4Pillars;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    abstract double calculateFare(double distance);

    void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    private String location;
    Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    public String getCurrentLocation() {
        return location;
    }
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;
    Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    public String getCurrentLocation() {
        return location;
    }
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;
    Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    public String getCurrentLocation() {
        return location;
    }
    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle v1 = new Car("UP85V1", "Bhavy", 15);
        Vehicle v2 = new Bike("UP85V2", "Kanhiya", 8);
        Vehicle v3 = new Auto("UP85V3", "Naman", 12);
        Vehicle[] vehicles = { v1, v2, v3 };
        double distance = 10;
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare: " + v.calculateFare(distance));
            System.out.println("----------------------");
        }
    }
}