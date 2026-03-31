package BridgeLabz_Day39_StreamApi;

import java.util.*;

public class TransformingNamesForDisplay {
    public static void main(String[] args) {
        List<String> names = List.of("Naman", "Bhavy", "Arsh", "Akarsh");
        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}