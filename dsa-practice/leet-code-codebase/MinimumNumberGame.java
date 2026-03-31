package BridgeLabz_Day25_Leetcode;

import java.util.*;
public class MinimumNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = numberGame(nums);
        System.out.println("Ans array is :");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] myArr = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            myArr[idx++] = nums[i + 1];
            myArr[idx++] = nums[i];
        }
        return myArr;
    }
}
