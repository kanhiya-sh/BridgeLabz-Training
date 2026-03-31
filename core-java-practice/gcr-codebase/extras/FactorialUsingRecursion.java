package Capgemini_Day10_Extras;

import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int number = myScan.nextInt();
        long fact = Factorial(number);
        System.out.println("The factorial of " + number + " is: " + fact);
    }
    public static long Factorial(int n) {
        if (n == 0 || n == 1) { // base case
            return 1;
        }
        return n * Factorial(n - 1);
    }
}
