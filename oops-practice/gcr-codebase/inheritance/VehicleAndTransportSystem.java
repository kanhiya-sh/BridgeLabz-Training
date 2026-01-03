package Capgemini_Day16_Inheritance;

class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo() {
        System.out.println("Speed is : " + maxSpeed);
        System.out.println("Fuel Type is : " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;
    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 15);
        Vehicle v3 = new Motorcycle(160, "Petrol", true);

        v1.displayInfo();
        System.out.println();

        v2.displayInfo();
        System.out.println();

        v3.displayInfo();
    }
}
