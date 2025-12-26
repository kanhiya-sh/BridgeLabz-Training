package Capgemini_Day9_Methods_Level3;

import java.util.Scanner;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); // creating scanner class for user input
        System.out.println("Enter a number: "); // asking user to enter a number
        int number = myScan.nextInt();

//       -------- defining all the methods here -------
        NumberChecker4 checker = new NumberChecker4(); // creating an object of the class
        boolean isPrime = checker.isPrimeNumber(number);
        boolean isNeon = checker.isNeonNumber(number);
        boolean isSpy = checker.isSpyNumber(number);
        boolean isAutomorphic = checker.isAutomorphicNumber(number);
        boolean isBuzz = checker.isBuzzNumber(number);

//       ------- Displaying the results -------

        System.out.println("Is Prime Number: " + isPrime);
        System.out.println("Is Neon Number: " + isNeon);
        System.out.println("Is Spy Number: " + isSpy);
        System.out.println("Is Automorphic Number: " + isAutomorphic);
        System.out.println("Is Buzz Number: " + isBuzz);
    }
    public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // checking divisibility from 2 to square root of number so that we need not to check the number to divide by itself
            if (number % i == 0) { // checking if the number is divisible by any number other than 1 and itself
                return false;
            }
        }
        return true;
    }
    public boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10; // adding the last digit of the square to sum
            square /= 10;
        }
        return sum == number; // checking if the sum of digits of square is equal to the number itself
    }
    public boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit; // adding the last digit to sum
            product *= digit; // multiplying the last digit to product
            number /= 10;
        }
        return sum == product; // checking if sum of digits is equal to product of digits
    }
    public boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number); // converting number to string for easy comparison
        String squareStr = String.valueOf(square); // converting square to string for easy comparison
        return squareStr.endsWith(numberStr); // checking if the square ends with the number itself
    }
    public boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7; // checking if the number is divisible by 7 or ends with 7
    }
}
