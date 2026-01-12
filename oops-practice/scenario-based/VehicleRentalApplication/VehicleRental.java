package BridgeLabz_Day22_ScenarioBased_OOPS.VehicleRentalApplication;
import java.util.*;

interface IRentable {
    double calculateRent(int days);
}

abstract class Vehicle implements IRentable {
    protected String vehicleNumber; // Unique ID
    protected String model;

    public Vehicle(String vehicleNumber, String model) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getModel() {
        return model;
    }
    // Setter to Update Operation
    public void setModel(String model) { this.model = model; }
    public String getDetails() {
        return "Vehicle No: " + vehicleNumber + ", Model: " + model;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, String model) {
        super(vehicleNumber, model);
    }
    @Override
    public double calculateRent(int days) {
        return days * 500;
    }
}

class Car extends Vehicle {
    public Car(String vehicleNumber, String model) {
        super(vehicleNumber, model);
    }
    @Override
    public double calculateRent(int days) {
        return days * 2000;
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, String model) {
        super(vehicleNumber, model);
    }
    @Override
    public double calculateRent(int days) {
        return days * 5000;
    }
}