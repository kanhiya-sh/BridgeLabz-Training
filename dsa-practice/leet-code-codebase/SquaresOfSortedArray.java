package BridgeLabz_Day20_Leetcode;

import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = myScan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = myScan.nextInt();
        }
        int[] result = sortedSquares(nums);
        System.out.println("The sorted squares of the array are:");
        for (int square : result) {
            System.out.print(square + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            }
            else {
                result[index--] = rightSquare;
                right--;
            }
        }

        return result;
    }
}
