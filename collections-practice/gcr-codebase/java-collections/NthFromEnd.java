package BridgeLabz_Day30_Collections;

import java.util.*;
public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 2;
        Iterator<String> fast = ll.iterator();
        Iterator<String> slow = ll.iterator();
        for (int i = 0; i < n; i++) {
            fast.next();
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        System.out.println(slow.next());
    }
}