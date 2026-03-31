package constructorAndInstance;

class Vehicle {

    // instance variables
    String ownerName;
    String vehicleType;

    // this is the class variable (shared by all vehicles)
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    void displayVehicleDetails() {
        System.out.println(
            "Owner: " + ownerName +
            ", Vehicle: " + vehicleType +
            ", Registration Fee: " + registrationFee
        );
    }

    // class method
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

public class VehicleRegistration {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
    // displaying details after update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
