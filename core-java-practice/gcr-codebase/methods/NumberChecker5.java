package Capgemini_Day9_Methods_Level3;

import java.util.Scanner;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); // creating scanner class for user input
        System.out.println("Enter a number: "); // asking user to enter a number
        int number = myScan.nextInt();

//       -------- defining all the methods here -------
        NumberChecker5 checker = new NumberChecker5(); // creating an object of the class
        boolean isPerfect = checker.isPerfectNumber(number);
        boolean isAbundant = checker.isAbundantNumber(number);
        boolean isDeficient = checker.isDeficientNumber(number);
        boolean isStrong = checker.isStrongNumber(number);

//       ------- Displaying the results -------
        System.out.println("Is Perfect Number: " + isPerfect);
        System.out.println("Is Abundant Number: " + isAbundant);
        System.out.println("Is Deficient Number: " + isDeficient);
        System.out.println("Is Strong Number: " + isStrong);
    }
    public boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }
    public boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }
    public boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
