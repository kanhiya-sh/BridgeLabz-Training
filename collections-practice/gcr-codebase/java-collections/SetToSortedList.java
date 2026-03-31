package BridgeLabz_Day30_Collections;

import java.util.*;
public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5,3,9,1));
        List<Integer> ll = new ArrayList<>(set);
        Collections.sort(ll);
        System.out.println(ll);
    }
}