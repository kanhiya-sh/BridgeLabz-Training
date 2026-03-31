package Capgemini_Day8_Methods_Level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int inputNumber = myScan.nextInt();
        Factors factorCalculator = new Factors();
        int[] factors = factorCalculator.findFactors(inputNumber);
        int[] calculations = factorCalculator.calculateSumSquareProduct(factors);
        System.out.println("Sum of factors is " + calculations[0]);
        System.out.println("Sum of square of factors is " + calculations[1]);
        System.out.println("Product of factors is " + calculations[2]);
    }
    // Method to find all factors of the number
    int[] findFactors(int number) {
        ArrayList<Integer> factorList = new ArrayList<>();
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                factorList.add(divisor);
            }
        }
        int[] factorsArray = new int[factorList.size()];
        for (int i = 0; i < factorList.size(); i++) {
            factorsArray[i] = factorList.get(i);
        }
        return factorsArray;
    }
    // Method to calculate sum, sum of squares, and product of factors
    int[] calculateSumSquareProduct(int[] factors) {
        int sum = 0;
        int sumOfSquares = 0;
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
            sumOfSquares += factors[i] * factors[i];
            product *= factors[i];
        }
        return new int[]{sum, sumOfSquares, product};
    }
}
