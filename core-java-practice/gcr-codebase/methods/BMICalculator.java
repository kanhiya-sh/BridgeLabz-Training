package Capgemini_Day8_Methods_Level2;

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter weight and height for 10 people");
        double weight[] = new double[10];
        double height[] = new double[10];
        BMICalculator calculate = new BMICalculator();
        for( int i = 0 ; i < 10 ; i++ ) {
            weight[i] = myScan.nextDouble();
            height[i] = myScan.nextDouble();
            double bmi = calculate.calculateBMI(weight[i],height[i]);
            String category = calculate.getCategory(bmi);
            System.out.println("Person " + (i + 1));
            System.out.println("weight " + weight[i] + " kg, height " + height[i] + " m");
            System.out.println("BMI " + bmi + ", Category " + category);
        }
    }
    public double calculateBMI(double weight, double height) {
        double h = height / 100;   // height in meters
        return weight / (h * h);
    }

    public String getCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25) {
            return "Normal weight";
        }
        else if (bmi < 30) {
            return "Overweight";
        }
        else {
            return "Obesity";
        }
    }
}