package Capgemini_Day10_Extras;

import  java.util.Scanner;
public class GcdAndLcmCalculator {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num1 = myScan.nextInt();
        int num2 = myScan.nextInt();
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
