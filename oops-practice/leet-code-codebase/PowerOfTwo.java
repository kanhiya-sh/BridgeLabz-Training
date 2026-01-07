package BridgeLabz_Day19_Leetcode;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a power of two: ");
        int n = myScan.nextInt();
        boolean result = isPowerOfTwo(n);
        if (result) {
            System.out.println(n + " is a power of two.");
        }
        else {
            System.out.println(n + " is not a power of two.");
        }
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
