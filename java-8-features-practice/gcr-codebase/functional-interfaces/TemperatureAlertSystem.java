package BridgeLabz_Day39_FunctionalInterfaces;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 40;
        System.out.println(alert.test(45.0) ? "ALERT" : "NORMAL");
    }
}
