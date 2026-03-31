package BridgeLabz_Day39_FunctionalInterfaces;

interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("No battery info");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed 80");
    }
    public void displayBattery() {
        System.out.println("Battery 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard dash = new ElectricCar();
        dash.displaySpeed();
        dash.displayBattery();
    }
}
