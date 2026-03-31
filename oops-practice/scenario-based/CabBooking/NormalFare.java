package BridgeLabz_Day19_ScenarioBased;

// Polymorphism
public class NormalFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10;
    }
}
