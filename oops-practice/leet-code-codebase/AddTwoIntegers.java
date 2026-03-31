package BridgeLabz_Day18_Leetcode;

import java.util.Scanner;
public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner scMyScan = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int num1 = scMyScan.nextInt();
        System.out.print("Enter second integer : ");
        int num2 = scMyScan.nextInt();
        System.out.println("Sum is : " + sum(num1, num2));
    }
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
