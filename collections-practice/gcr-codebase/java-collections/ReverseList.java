package BridgeLabz_Day30_Collections;

import java.util.*;
public class ReverseList {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseList(ll);
        System.out.println(ll);
        List<Integer> link = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseList(link);
        System.out.println(link);
    }
    public static <T> void reverseList(List<T> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}