package BridgeLabz_Day40_AeroVigilProblem;

import java.util.Scanner;

public class AeroVigil {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        FlightUtil fu = new FlightUtil();
        System.out.println("Enter flight details");
        try {
            String userInput = myScan.nextLine();
            String[] details = userInput.split(":");

            String flightNumber = details[0];
            String flightName = details[1];
            int passengerCount = Integer.parseInt(details[2]);
            double currentFuelLevel = Double.parseDouble(details[3]);

            fu.validateFlightNumber(flightNumber);
            fu.validateFlightName(flightName);
            fu.validatePassengerCount(passengerCount, flightName);

            double fuelRequired = fu.calculateFuelToFillTank(flightName, currentFuelLevel);
            System.out.println("Fuel required to fill the tank : " + fuelRequired + " liters");

        }
        catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
