package Capgemini_Day8_Methods_Level1;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a angle : ");
        double angleInDeg = myScan.nextDouble();
        TrigonometricFunctions obj = new TrigonometricFunctions();
        double[] trigFunctions = obj.calculateTrigonometricFunctions(angleInDeg);
        System.out.println("Sine: " + trigFunctions[0]);
        System.out.println("Cosine: " + trigFunctions[1]);
        System.out.println("Tangent: " + trigFunctions[2]);
    }
    public double[] calculateTrigonometricFunctions(double angleInDeg) {
        double angleInRadians = Math.toRadians(angleInDeg);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[]{sine, cosine, tangent};
    }
}
