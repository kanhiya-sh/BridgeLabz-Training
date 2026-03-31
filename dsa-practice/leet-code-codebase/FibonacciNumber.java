package BridgeLabz_Day21_Leetcode;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int a = 0, b = 1;
        int c = 0;
        for (int  i = 2 ; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
