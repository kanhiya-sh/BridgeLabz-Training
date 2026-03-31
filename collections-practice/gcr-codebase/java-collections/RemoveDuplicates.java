package BridgeLabz_Day30_Collections;

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(3,1,2,2,3,4);
        Set<Integer> set = new LinkedHashSet<>(ll);
        System.out.println(new ArrayList<>(set));
    }
}