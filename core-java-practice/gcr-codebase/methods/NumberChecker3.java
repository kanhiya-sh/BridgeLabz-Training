package Capgemini_Day9_Methods_Level3;

import java.util.Scanner;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); // creating scanner class for user input
        System.out.println("Enter a number: "); // asking user to enter a number
        int number = myScan.nextInt();

//       -------- defining all the methods here -------

        NumberChecker3 checker = new NumberChecker3(); // creating an object of the class
        int digitCount = checker.countDigits(number);
        int[] digits = checker.storeDigits(number, digitCount);
        int[] reversedDigits = checker.reverseDigits(digits);
        boolean areEqual = checker.compareArrays(digits, reversedDigits);
        boolean isPalindrome = checker.isPalindrome(areEqual);
        boolean isDuck = checker.isDuckNumber(digits);

//       ------- Displaying the results -------

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Reversed Digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println("\nAre Original and Reversed arrays equal: " + areEqual);
        System.out.println("Is Palindrome Number: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
    }
    public int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public int[] storeDigits(int number, int digitCount) {
        int[] digits = new int[digitCount]; // creating an array to store digits
        for (int i = digitCount - 1; i >= 0; i--) { // storing digits in reverse order so that they ordered in correct order
            digits[i] = number % 10; // using modulus to get the last digit of the entered number and store it in the array
            number /= 10; // removing the last digit from the number by dividing it by 10
        }
        return digits;
    }
    public int[] reverseDigits(int[] digits) {
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = digits[n - 1 - i]; // in this we are reversing the digits array by storing last element at first index and so on
        }
        return reversed;
    }
    public boolean compareArrays(int[] digits, int[] reversedDigits) {
        if (digits.length != reversedDigits.length) {
            return false;
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != reversedDigits[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(boolean areEqual) {
        return areEqual; // if both arrays are equal after checking it upper in compareArrays method then it is a palindrome number
    }
    public boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) { // here if we find any digit other than 0 we return true confirming it is a duck number
                return true;
            }
        }
        return false;
    }
}
