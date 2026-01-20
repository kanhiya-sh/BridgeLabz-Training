package BridgeLabz_Day28_RuntimeBigONotation;

import java.util.*;
public class LinearVsBinarySearch {
    public static void main(String[] args) {
        int[] data = {12, 5, 8, 20, 1, 15};
        int target = 15;
        System.out.println("Linear Search index is : " + linearSearch(data, target));
        System.out.println("Binary Search index is : " + binarySearch(data, target));
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i : arr) if (i == target) return i;
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) return m;
            if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}