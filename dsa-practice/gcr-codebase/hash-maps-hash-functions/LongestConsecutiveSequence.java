package BridgeLabz_Day24_HashMapHashFunctions;

import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = longestSequence(arr);
        System.out.println("Longest consecutive sequence length is : " + result);
    }
    public static int longestSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for (int num : arr) {
            set.add(num);
        }
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
