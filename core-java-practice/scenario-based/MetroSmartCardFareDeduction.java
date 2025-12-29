package Capgemini_Day10_ScenarioBased;

import  java.util.Scanner;
public class MetroSmartCardFareDeduction {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        double smartCardBalance = 500.0; // Initial balance
        System.out.println("Welcome to Delhi Metro Smart Card System");
        System.out.println("Your current smart card balance is: " + smartCardBalance);

        while (true) {
            System.out.print("Enter travel distance in km (or -1 to quit): ");
            int distance = myScan.nextInt();
            if (distance == -1) {
                System.out.println("Thank you");
                break;
            }
            double fare = (distance <= 5) ? 20.0 : (distance <= 15) ? 40.0 : (distance <= 25) ? 60.0 : 80.0;
            if (fare > smartCardBalance) {
                System.out.println("Insufficient balance! Your current balance is: " + smartCardBalance);
                break;
            }
            else {
                smartCardBalance -= fare;
                System.out.println("Fare for " + distance + " km is: " + fare);
                System.out.println("Remaining smart card balance: " + smartCardBalance);
            }
        }
    }
}
