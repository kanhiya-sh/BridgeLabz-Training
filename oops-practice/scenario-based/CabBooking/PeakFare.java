package BridgeLabz_Day19_ScenarioBased;

// Polymorphism
public class PeakFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15;
    }
}
