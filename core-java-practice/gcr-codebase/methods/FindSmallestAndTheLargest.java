package Capgemini_Day8_Methods_Level1;

import java.util.Scanner;

public class FindSmallestAndTheLargest {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = myScan.nextInt();
        int num2 = myScan.nextInt();
        int num3 = myScan.nextInt();
        FindSmallestAndTheLargest findObj = new FindSmallestAndTheLargest();
        int largestAndSmallest[] = findObj.findLargestAndSmallest(num1, num2, num3);
        System.out.println("Largest number is: " + largestAndSmallest[0]);
        System.out.println("Smallest number is: " + largestAndSmallest[1]);
    }
    public int[] findLargestAndSmallest(int num1, int num2, int num3) {
        int largest = num1;
        int smallest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        return new int[]{largest, smallest};
    }
}
