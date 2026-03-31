package Capgemini_Day9_Methods_Level3;

import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); // creating scanner class for user input
        System.out.println("Enter a number: "); // asking user to enter a number
        int number = myScan.nextInt();

//       -------- defining all the methods here -------

        NumberChecker2 checker = new NumberChecker2(); // creating an object of the class
        int digitCount = checker.countDigits(number);
        int[] digits = checker.storeDigits(number, digitCount);
        int sumOfDigits = checker.sumOfDigits(digits);
        int sumOfSquares = checker.sumOfSquares(digits);
        boolean isHarshad = checker.isHarshadNumber(number, sumOfDigits);
        int[][] frequency = checker.digitFrequency(digits);

//       ------- Displaying the results -------

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequency: ");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit: " + frequency[i][0] + " Frequency: " + frequency[i][1]);
        }
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
    public int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) { // using for each loop
            sum += digit;
        }
        return sum;
    }
    public int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // squaring each digit and adding it to sum
        }
        return sum;
    }
    public boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0; // checking if the number is divisible by the sum of its digits
    }
    public int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // creating a 2D array to store frequency of each digit from 0 to 9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // first column will store the digit
            frequency[i][1] = 0; // second column will store the frequency of the digit
        }
        for (int digit : digits) {
            frequency[digit][1]++; // incrementing the frequency of the digit found in the digits array
        }
        return frequency;
    }
}
