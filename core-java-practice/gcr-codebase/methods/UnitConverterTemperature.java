package Capgemini_Day8_Methods_Level2;

import java.util.*;
public class UnitConverterTemperature {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = myScan.nextDouble();

        UnitConverterTemperature converter = new UnitConverterTemperature();
        double celsius = converter.fahrenheitToCelsius(num);
        double fahrenheit = converter.celsiusToFahrenheit(num);
        double kilograms = converter.poundsToKilograms(num);
        double pounds = converter.kilogramsToPounds(num);
        double liters = converter.gallonsToLiters(num);
        double gallons = converter.litersToGallons(num);

//        -------- Displaying the conversion results ---------
        System.out.println(num + " Fahrenheit is " + celsius + " Celsius");
        System.out.println(num + " Celsius is " + fahrenheit + " Fahrenheit");
        System.out.println(num + " pounds is " + kilograms + " kilograms");
        System.out.println(num + " kilograms is " + pounds + " pounds");
        System.out.println(num + " gallons is " + liters + " liters");
        System.out.println(num + " liters is " + gallons + " gallons");
    }
    public double fahrenheitToCelsius(double farhenheit){
        double celsius = (farhenheit - 32) * 5 / 9;
        return celsius;
    }
    public double celsiusToFahrenheit(double celsius){
        double f = (celsius * 9 / 5) + 32;
        return f;
    }
    double poundsToKilograms(double pounds){
        double km = 0.453592;
        return pounds * km;
    }
    double kilogramsToPounds(double kilograms){
        double pounds = 2.20462;
        return kilograms * pounds;
    }
    double gallonsToLiters(double gallons){
        double liters = 3.78541;
        return gallons * liters;
    }
    double litersToGallons(double liters){
        double gallons = 0.264172;
        return liters * gallons;
    }

    
}

