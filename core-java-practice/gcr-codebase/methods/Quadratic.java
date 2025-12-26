package Capgemini_Day8_Methods_Level2;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b and c : ");
        int coefficientA = myScan.nextInt();
        int coefficientB = myScan.nextInt();
        int coefficientC = myScan.nextInt();
        Quadratic quadraticSolver = new Quadratic();
        String result = quadraticSolver.findRoots(coefficientA, coefficientB, coefficientC);
        System.out.println(result);
    }
    public String findRoots(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Positive roots: " + root1 + " and " + root2;
        }
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "Equal root: " + root;
        }
        else {
            return "No real roots";
        }
    }
}
