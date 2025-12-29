package Capgemini_Day10_ScenarioBased;

import java.util.*;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int totalDistance = 0;
        String userInput = "";
        while (true) {
            System.out.print("Enter distance to next stop : ");
            int distance = myScan.nextInt();
            totalDistance += distance;
            System.out.println("Distance traveled yet is : " + totalDistance + " km");
            System.out.print("Do you want to get off at this stop? (yes/no): ");
            userInput = myScan.next(); // this is for asking yes or no to travel more
            if (userInput.equalsIgnoreCase("yes")) { // this will ignore the case sensitivity
                System.out.println("Total distance traveled is : " + totalDistance + " km");
                break;
            }
        }
    }
}
