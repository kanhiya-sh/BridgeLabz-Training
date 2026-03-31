package BridgeLabz_Day39_StreamApi;

import java.util.*;
import java.util.stream.*;

class Claim {

    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = List.of(
                new Claim("Health", 20000),
                new Claim("Health", 30000),
                new Claim("Car", 15000)
        );
        Map<String, Double> averageByType =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                c -> c.type,
                                Collectors.averagingDouble(c -> c.amount)
                        ));
        averageByType.forEach(
                (type, avg) -> System.out.println(type + " : " + avg)
        );
    }
}
