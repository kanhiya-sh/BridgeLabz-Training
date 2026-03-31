package BridgeLabz_Day24_HashMapHashFunctions;

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = myScan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = myScan.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = myScan.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println("Indices are:");
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] arr = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first ;
            if(map.containsKey(second)){
                arr[0] = map.get(second);
                arr[1] = i;
                return arr;
            }
            map.put(first, i);
        }
        return arr;
    }
}
