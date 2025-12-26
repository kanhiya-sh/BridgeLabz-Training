package Capgemini_Day8_Methods_Level1;

import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        double temperature = myScan.nextDouble();
        System.out.print("Enter wind speed : ");
        double windSpeed = myScan.nextDouble();

        WindChillCalculator obj = new WindChillCalculator();
        double windChill = obj.calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature is: " + windChill);
    }
    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}
