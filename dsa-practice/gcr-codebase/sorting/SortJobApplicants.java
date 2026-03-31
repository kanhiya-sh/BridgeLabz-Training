package BridgeLabz_Day25_SortingAlgo;

import java.util.Scanner;
public class SortJobApplicants { // heap sort
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter count of job applicants : ");
        int n = myScan.nextInt();
        int[] salaries = new int[n];
        System.out.println("Enter expected salaries : ");
        for (int i = 0; i < n; i++) {
            salaries[i] = myScan.nextInt();
        }
        heapSort(salaries);
        System.out.println("Sorted salary :");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
    public static void heapSort(int[] numsArr) {
        int n = numsArr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            reHeapify(numsArr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = numsArr[0];
            numsArr[0] = numsArr[i];
            numsArr[i] = temp;
            reHeapify(numsArr, i, 0);
        }
    }
    public static void reHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            reHeapify(arr, n, largest);
        }
    }
}
