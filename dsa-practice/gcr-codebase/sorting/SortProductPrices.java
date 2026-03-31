package BridgeLabz_Day25_SortingAlgo;

import java.util.Scanner;

public class SortProductPrices { // Quick Sort
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter Products count : ");
        int n = myScan.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter product prices : ");
        for (int i = 0; i < n; i++) {
            prices[i] = myScan.nextInt();
        }
        quickSort(prices, 0, n - 1);
        System.out.println("Sorted product prices are :");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }
}
