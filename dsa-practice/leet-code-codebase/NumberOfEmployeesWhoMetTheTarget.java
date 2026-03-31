package BridgeLabz_Day24_Leetcode;

import java.util.*;
public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number of employees : ");
        int n = myScan.nextInt();
        System.out.println("Enter the number of hours completed by each employee : ");
        int[] hours = new int[n];
        for (int i = 0; i < n; i++) {
            hours[i] = myScan.nextInt();
        }
        System.out.println("Enter the targeted hours : ");
        int target = myScan.nextInt();
        System.out.println("Total Number of employees who met the target : " + numberOfEmployeesWhoMetTarget(hours, target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter=0;
        for(int i = 0; i < hours.length; i++){
            if(hours[i] >= target){
                counter++;
            }
        }
        return counter;
    }
}
