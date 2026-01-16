package BridgeLabz_Day25_SortingAlgo;

import java.util.Scanner;
public class SortExamScores { // Selection Sort
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter Students count : ");
        int n = myScan.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter exam scores : ");
        for (int i = 0; i < n; i++) {
            scores[i] = myScan.nextInt();
        }
        selectionSort(scores);
        System.out.println("Sorted exam scores : ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int miniIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[miniIdx]) {
                    miniIdx = j;
                }
            }
            int temp = nums[miniIdx];
            nums[miniIdx] = nums[i];
            nums[i] = temp;
        }
    }
}
