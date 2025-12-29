package Capgemini_Day10_Extras;

import  java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int low = 1;
        int high = 100;
        String feedback = "";
        System.out.println("Think of a number between 1 and 100");
        while (!feedback.equals("correct")) {
            int guess = low + (high - low) / 2; // Generating guess using binary search as this is more efficient than random guessing
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = myScan.nextLine().toLowerCase();
            if (feedback.equals("high")) {
                high = guess - 1; // Adjusting the high boundary
            }
            else if (feedback.equals("low")) {
                low = guess + 1; // Adjusting the low boundary
            }
            else if (feedback.equals("correct")) {
                System.out.println("The number you Guessed is " + guess);
            }
            else {
                System.out.println("Invalid input.");
            }
        }
    }
}
