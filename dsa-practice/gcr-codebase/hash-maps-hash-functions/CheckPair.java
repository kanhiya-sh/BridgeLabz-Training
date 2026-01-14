package BridgeLabz_Day24_HashMapHashFunctions;

import java.util.*;

public class CheckPair {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = myScan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements inside your array");
        for (int i = 0; i < n; i++) {
            arr[i] = myScan.nextInt();
        }
        System.out.println("Enter the target sum you want to achieve : ");
        int target = myScan.nextInt();
        boolean result = hasPairSum(arr, target);
        if(result) {
            System.out.println("Pair with the target sum exists");
        }
        else {
            System.out.println("Pair with the target sum doesn't exists");
        }
    }
    public static boolean hasPairSum(int [] arr , int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            int requiredNumber = target - num;
            if(set.contains(requiredNumber)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
