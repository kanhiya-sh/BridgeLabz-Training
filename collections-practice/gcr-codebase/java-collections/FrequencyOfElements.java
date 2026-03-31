package BridgeLabz_Day30_Collections;

import java.util.*;
public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> ll = Arrays.asList("apple","banana","apple","orange");
        Map<String,Integer> map = new HashMap<>();
        for(String str : ll){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        System.out.println(map);
    }
}