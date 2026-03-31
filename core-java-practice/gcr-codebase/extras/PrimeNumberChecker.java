package Capgemini_Day10_Extras;

import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = myScan.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 will never be a prime number
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // going till the square root of num so that number can not be divided by itself
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
