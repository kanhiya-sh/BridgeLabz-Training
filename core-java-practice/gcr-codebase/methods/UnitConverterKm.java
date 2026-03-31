package Capgemini_Day8_Methods_Level2;

import java.util.*;

public class UnitConverterKm {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a value: ");
        double num = myScan.nextDouble();

//      -------- Using the UnitConverterKm class to perform conversions ---------

        UnitConverterKm converter = new UnitConverterKm();
        double miles = converter.kmToMiles(num);
        double kilometers = converter.milesToKm(num);
        double feet = converter.metersToFeet(num);
        double meters = converter.feetToMeters(num);

//      -------- Displaying the conversion results ---------

        System.out.println(num + " kilometers is " + miles + " miles");
        System.out.println(num + " miles is " + kilometers + " kilometers");
        System.out.println(num  + " meters is " + feet + " feet");
        System.out.println(feet + " feet is " + meters + " meters");        
    }
    public double kmToMiles(double km){
        double miles = 0.621371;
        return km * miles;
    }
    public double milesToKm(double miles){
        double km = 1.60934;
        return miles * km;
    }
    public double metersToFeet(double meters){
        double feet = 3.28084;
        return meters * feet;
    }
    public double feetToMeters(double feet){
        double meters = 0.3048;
        return feet * meters;
    }
    
}




