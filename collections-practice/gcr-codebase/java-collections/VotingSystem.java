package BridgeLabz_Day30_Collections;

import java.util.*;
public class VotingSystem {
    public static void main(String[] args) {
        Map<String,Integer> votes = new HashMap<>();
        votes.put("A",10);
        votes.put("B",25);
        votes.put("C",15);
        Map<String,Integer> insertionOrder = new LinkedHashMap<>(votes);
        TreeMap<Integer,String> sortedResult = new TreeMap<>();
        for (String str : votes.keySet()) {
            sortedResult.put(votes.get(str), str);
        }
        System.out.println("Insertion Order is : " + insertionOrder);
        System.out.println("Sorted Result is : " + sortedResult.descendingMap());
    }
}
