

import java.util.Scanner;

public class FindFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array needs to be resized
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] tempArray = new int[maxFactor];

                    // Copy elements to new array
                    for (int j = 0; j < factors.length; j++) {
                        tempArray[j] = factors[j];
                    }

                    factors = tempArray;
                }

                // Add factor to array
                factors[index] = i;
                index++;
            }
        }

        // Displaying factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
