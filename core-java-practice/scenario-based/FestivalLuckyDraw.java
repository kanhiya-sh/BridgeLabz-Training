package Capgemini_Day10_ScenarioBased;

import java.util.*;
public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number (or press -1 to exit): ");
            int number = myScan.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input! Exiting the program.");
                break;
            }
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift.");
            }
            else {
                System.out.println("Better luck next time.");
            }
        }
    }
}
