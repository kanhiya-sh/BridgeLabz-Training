

import java.util.Scanner;

public class AreaTriangleInSqInchesAndSqCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaTriangle = 0.5 * base * height; // area in square centimeters
        double inSqInches = areaTriangle / 6.452; // converting square centimeters to square inches
        System.out.println("Your Area of Triangle in cm is " + areaTriangle + " while in inches is " + inSqInches);


    }
}
