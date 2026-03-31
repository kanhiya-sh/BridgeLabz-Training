package BridgeLabz_Day22_ScenarioBased_OOPS.TrafficManagerRoundAboutVehicleFlow;

import java.util.*;
public class TrafficManagerMain {
    public static void main(String[] args) {
        TrafficManager tm = new TrafficManager();
        // Queue cars
        tm.enqueue("Car-A");
        tm.enqueue("Car-B");
        tm.enqueue("Car-C");
        tm.printQueue();
        // Move cars from queue to roundabout
        String car1 = tm.dequeue();
        tm.addCarToRoundabout(car1);
        String car2 = tm.dequeue();
        tm.addCarToRoundabout(car2);
        tm.printRoundabout();
        // Add & remove dynamically
        tm.addCarToRoundabout("Car-D");
        tm.printRoundabout();
        tm.removeCarFromRoundabout("Car-B");
        tm.printRoundabout();
        tm.printQueue();
    }
}
