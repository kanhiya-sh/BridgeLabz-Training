package BridgeLabz_Day39_StreamApi;

import java.util.*;

public class IoTSensorsReadings {
    public static void main(String[] args) {
        List<Integer> ll = List.of(40, 80, 30, 90, 55, 60, 45);
        ll.stream()
                .filter(x -> x > 50)
                .forEach(System.out::println);
    }
}