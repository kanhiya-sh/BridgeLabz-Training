package BridgeLabz_Day26_Leetcode;

import java.util.Scanner;

public class DifferenceBetweenSumAndDigitSum {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        int[] numsArr = new int[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = myScan.nextInt();
        }
        System.out.println(differenceOfSum(numsArr));
    }
    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}
