package BridgeLabz_Day39_FunctionalInterfaces;

interface RentalVehicle {
    void rent();
    void returnVehicle();
}

class Car implements RentalVehicle {
    public void rent() {
        System.out.println("Car rented");
    }
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

class Bike implements RentalVehicle {
    public void rent() {
        System.out.println("Bike rented");
    }
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

class Bus implements RentalVehicle {
    public void rent() {
        System.out.println("Bus rented");
    }
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}

public class MultiVehicleRentalSystem {
    public static void main(String[] args) {
        RentalVehicle vehicle = new Car();
        vehicle.rent();
        vehicle.returnVehicle();
    }
}
