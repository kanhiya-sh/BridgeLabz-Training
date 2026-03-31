package Capgemini_Day9_Methods_Level3;

import java.util.Scanner;

public class FindFactorsOfNumber {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); // creating scanner class for user input
        System.out.println("Enter a number: "); // asking user to enter a number
        int number = myScan.nextInt();

//      -------- defining all the methods here -------
        FindFactorsOfNumber finder = new FindFactorsOfNumber();
        int[] factors = finder.findFactors(number);
        int greatestFactor = finder.findGreatestFactor(factors);
        int sumOfFactors = finder.sumOfFactors(factors);
        int productOfFactors = finder.productOfFactors(factors);
        int productOfCubes = finder.productOfCubesOfFactors(factors);

//      ------- Displaying the results -------
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nGreatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);
    }
    public int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }
    public int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public int productOfCubesOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}
