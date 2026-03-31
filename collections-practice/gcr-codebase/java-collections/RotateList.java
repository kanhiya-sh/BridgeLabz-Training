package BridgeLabz_Day30_Collections;

import java.util.*;
public class RotateList {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        int k = 2;
        k = k % ll.size();
        List<Integer> result = new ArrayList<>();
        result.addAll(ll.subList(k, ll.size()));
        result.addAll(ll.subList(0, k));
        System.out.println(result);
    }
}