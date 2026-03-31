package BridgeLabz_Day25_SortingAlgo;

import java.util.Scanner;
public class SortArrayOfBookPrices { // Merge Sort
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter Books Count : ");
        int n = myScan.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter Book prices :");
        for (int i = 0; i < n; i++) {
            prices[i] = myScan.nextInt();
        }
        mergeSort(prices, 0, n - 1);
        System.out.println("Sorted prices are : ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftPart = new int[n1];
        int[] rightPart = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftPart[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightPart[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftPart[i] <= rightPart[j]) {
                arr[k++] = leftPart[i++];
            }
            else {
                arr[k++] = rightPart[j++];
            }
        }
        while (i < n1){
            arr[k++] = leftPart[i++];
        }
        while (j < n2) {
            arr[k++] = rightPart[j++];
        }
    }
}
