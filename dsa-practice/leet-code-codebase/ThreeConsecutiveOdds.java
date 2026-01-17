package BridgeLabz_Day27_Leetcode;

import java.util.*;
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = myScan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = myScan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    System.out.println(true);
                    return;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println(false);
    }
}
