package BridgeLabz_Day30_Collections;

import java.util.*;
public class GenerateBinary {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i = 0; i < n; i++) {
            String str = q.remove();
            System.out.print(str + " ");
            q.add(str +"0");
            q.add(str +"1");
        }
    }
}