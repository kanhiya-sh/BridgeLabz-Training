package BridgeLabz_Day30_Collections;

import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]","");
        Map<String,Integer> map = new HashMap<>();
        for(String w : text.split(" "))  {
            map.put(w,map.getOrDefault(w,0)+1);
        }
        System.out.println(map);
    }
}