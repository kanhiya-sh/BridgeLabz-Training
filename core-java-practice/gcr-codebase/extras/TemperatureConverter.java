package Capgemini_Day10_Extras;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
//        here converting Celsius to Fahrenheit
        System.out.println("Enter Temperature in Celsius : ");
        double celsius = myScan.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");

//        here converting Fahrenheit to Celsius
        System.out.println("Enter temperature in Fahrenheit : ");
        fahrenheit = myScan.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
    }
}
