package BridgeLabz_Day25_SortingAlgo;

import java.util.Scanner;

public class SortEmployeeIDs {  //  Insertion Sort
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = myScan.nextInt();
        int[] ids = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            ids[i] = myScan.nextInt();
        }
        insertionSort(ids);
        System.out.println("Sorted Array is : ");
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
    public static void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            ids[j + 1] = key;
        }
    }
}
