package Capgemini_Day9_Methods_Level3;

import java.util.*;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); // creating scanner class for user input
        System.out.println("Enter a number: "); // asking user to enter a number
        int number = myScan.nextInt();

//       -------- defining all the methods here -------
        NumberChecker checker = new NumberChecker();
        int digitCount = checker.countDigits(number);
        int[] digits = checker.storeDigits(number, digitCount);
        boolean isDuck = checker.isDuckNumber(digits);
        boolean isArmstrong = checker.isArmstrongNumber(digits, digitCount);
        int[] largestAndSecondLargest = checker.findLargestAndSecondLargest(digits);
        int[] smallestAndSecondSmallest = checker.findSmallestAndSecondSmallest(digits);

//       ------- Displaying the results -------
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest Digit: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest Digit: " + largestAndSecondLargest[1]);
        System.out.println("Smallest Digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest Digit: " + smallestAndSecondSmallest[1]);
    }
    public int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public int[] storeDigits(int number, int digitCount) {
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
    public boolean isArmstrongNumber(int[] digits, int digitCount) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digitCount);
        }
        int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }
        return sum == originalNumber;
    }
    public int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
