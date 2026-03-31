package Capgemini_Day10_Extras;

import java.util.Scanner;
public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter All Three Numbers : ");
        int num1 = myScan.nextInt();
        int num2 = myScan.nextInt();
        int num3 = myScan.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The Maximum Numbers is : " + max);
    }
}
