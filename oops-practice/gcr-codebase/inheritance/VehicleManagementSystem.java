package Capgemini_Day16_Inheritance;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println(model + " is charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle(150, "Tesla");
        PetrolVehicle p = new PetrolVehicle(180, "Ferrari");
        e.charge();
        p.refuel();
    }
}
