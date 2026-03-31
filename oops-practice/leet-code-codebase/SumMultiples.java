package BridgeLabz_Day22_Leetcode;

import java.util.Scanner;

public class SumMultiples {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
