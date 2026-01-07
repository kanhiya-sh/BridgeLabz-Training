package BridgeLabz_Day19_Leetcode;

import java.util.Scanner;
public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = myScan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = myScan.nextInt();
        }
        System.out.print("Enter the original value : ");
        int original = myScan.nextInt();
        int result = findFinalValue(nums, original);
        System.out.println("Final Value : " + result);
    }
    public static int findFinalValue(int[] nums, int original) {
        boolean found = true;
        while (found) {
            found = false;
            for (int num : nums) {
                if (num == original) {
                    original *= 2;
                    found = true;
                }
            }
        }
        return original;
    }
}
