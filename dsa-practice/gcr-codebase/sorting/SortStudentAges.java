package BridgeLabz_Day25_SortingAlgo;

import java.util.Scanner;
public class SortStudentAges { // counting sort
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter students count : ");
        int n = myScan.nextInt();
        int[] ages = new int[n];
        System.out.println("Enter student ages (10 to 18) : ");
        for (int i = 0; i < n; i++) {
            ages[i] = myScan.nextInt();
        }
        countingSort(ages);
        System.out.println("Sorted student ages : ");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
    public static void countingSort(int[] agesArr) {
        int minAge = 10;
        int maxAge = 18;
        int[] countArr = new int[maxAge - minAge + 1];
        for (int age : agesArr) {
            countArr[age - minAge]++;
        }
        int idx = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                agesArr[idx++] = i + minAge;
                countArr[i]--;
            }
        }
    }
}
