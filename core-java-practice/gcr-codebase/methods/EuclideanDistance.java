package Capgemini_Day9_Methods_Level3;

import java.util.*;
public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter coordinates of first point (x1 , y1) ");
        int x1 = myScan.nextInt();
        int y1 = myScan.nextInt();
        System.out.println("Enter coordinates of second point (x2 , y2) ");
        int x2 = myScan.nextInt();
        int y2 = myScan.nextInt();
        EuclideanDistance findDistance = new EuclideanDistance();
        double distance = findDistance.calculateDistance(x1, y1, x2, y2);
        findDistance.lineEquation(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points " + distance);
    }
    public double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));
    }
    public void lineEquation(int x1, int y1, int x2, int y2) {
        int m = (y2 - y1) / (x2 - x1) ;
        int c = y1 - m * x1 ;
        System.out.println("Equation of line: y = " + m + "x + " + c);
    }
}
