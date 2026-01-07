package BridgeLabz_Day19_ScenarioBased;
// Encapsulation
public class Driver {
    public int driverId;
    public String name;
    public boolean available; // true = available, false = busy

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.available = true;
    }
}

