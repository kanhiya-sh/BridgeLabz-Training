package BridgeLabz_Day18_Leetcode;

import java.util.*;
public class SumOfTwoIntegers {
    public static void main(String[] args) {
        Scanner scMyScan = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int a = scMyScan.nextInt();
        System.out.print("Enter second integer : ");
        int b = scMyScan.nextInt();
        System.out.println("Total Sum is : " + getSum(a, b));
    }
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
