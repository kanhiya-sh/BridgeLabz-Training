package BridgeLabz_Day24_HashMapHashFunctions;

import java.util.*;
public class FindAllSubarraysWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2};
        subarraySumZero(arr);
    }
    public static void subarraySumZero(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int startIdx : map.get(sum)) {
                    System.out.println("Subarray with zero sum is : [" + (startIdx + 1) + " , " + i + "]");
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}
