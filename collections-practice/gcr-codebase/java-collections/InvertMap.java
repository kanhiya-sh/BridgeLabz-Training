package BridgeLabz_Day30_Collections;

import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",1,"B",2,"C",1);
        Map<Integer,List<String>> res = new HashMap<>();
        for(String k : map.keySet()) {
            res.computeIfAbsent(map.get(k),x->new ArrayList<>()).add(k);
        }
        System.out.println(res);
    }
}