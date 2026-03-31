package BridgeLabz_Day22_Leetcode;

import java.util.Scanner;

public class SubtractProductSumDigitsInteger {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        System.out.println(product - sum);
    }
}
