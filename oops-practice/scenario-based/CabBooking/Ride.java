package BridgeLabz_Day19_ScenarioBased;
// Encapsulation
public class Ride {
    public User user;
    public Driver driver;
    public double fare;

    public Ride(User user, Driver driver, double fare) {
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }
}
