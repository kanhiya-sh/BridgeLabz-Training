package Capgemini_Day8_Methods_Level2;

import java.util.*;
public class UnitConverterYard {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a value: ");
        double num = myScan.nextDouble();

        UnitConverterYard converter = new UnitConverterYard();
        double feet = converter.yardsToFeet(num);
        double yards = converter.feetToYards(num);
        double inches = converter.metersToInches(num);
        double meters = converter.inchesToMeters(num);
        double cm = converter.inchesToCentimeters(num);

//        -------- Displaying the conversion results ---------
        System.out.println(num + " yards is " + feet + " feet");
        System.out.println(num + " feet is " + yards + " yards");
        System.out.println(num  + " meters is " + inches + " inches");
        System.out.println(num + " inches is " + meters + " meters");
        System.out.println(num  + " inches is " + cm + " centimeters");
    }  
    public double yardsToFeet(double yards){
        double feet = 3;
        return yards * feet;
    }
    public double feetToYards(double feet){
        double yards = 0.333333;
        return feet * yards;
    }
    public double metersToInches(double meters){
        double inches = 39.3701;
        return meters * inches;
    }
    public double inchesToMeters(double inches){
        double meters = 0.0254;
        return inches * meters;
    }
    public double inchesToCentimeters(double inches){
        double centimeters = 2.54;
        return inches * centimeters;
    }
}

