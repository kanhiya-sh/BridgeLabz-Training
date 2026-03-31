package BridgeLabz_Day17_4Pillars;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type ;
    private double rentalRate ;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    Car(String number, double rate) {
        super(number, "Car", rate);
    }
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 500;
    }
    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

class Bike extends Vehicle implements Insurable {
    Bike(String number, double rate) {
        super(number, "Bike", rate);
    }
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 200;
    }
    public String getInsuranceDetails() {
        return "Bike Insurance";
    }
}

class Truck extends Vehicle implements Insurable {
    Truck(String number, double rate) {
        super(number, "Truck", rate);
    }
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 1000;
    }
    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR101", 2000);
        Vehicle v2 = new Bike("BIKE102", 800);
        Vehicle v3 = new Truck("TRK103", 4000);
        Vehicle[] vehicles = { v1, v2, v3 };
        int days = 2;
        for (Vehicle v : vehicles) {
            System.out.println("Your Vehicle Number is : " + v.getVehicleNumber());
            System.out.println("Type of your vehicle is : " + v.getType());
            System.out.println("Rental Cost : " + v.calculateRentalCost(days));
            System.out.println("Insurance Cost : " + ((Insurable) v).calculateInsurance());
            System.out.println("------------------------");
        }
    }
}
