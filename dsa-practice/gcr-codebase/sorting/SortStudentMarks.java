package BridgeLabz_Day25_SortingAlgo;

import java.util.*;
public class SortStudentMarks { // Bubble Sort
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = myScan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = myScan.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Sorted Array is : ");
        for (int m : arr) {
            System.out.print(m + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
