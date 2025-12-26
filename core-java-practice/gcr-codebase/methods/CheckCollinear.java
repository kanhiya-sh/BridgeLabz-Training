package Capgemini_Day9_Methods_Level3;

import java.util.*;
public class CheckCollinear {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter coordinates of first point (x1 , y1) ");
        int x1 = myScan.nextInt();
        int y1 = myScan.nextInt();
        System.out.println("Enter coordinates of second point (x2 , y2) ");
        int x2 = myScan.nextInt();
        int y2 = myScan.nextInt();
        System.out.println("Enter coordinates of third point (x3 , y3) ");
        int x3 = myScan.nextInt();
        int y3 = myScan.nextInt();

        CheckCollinear checker = new CheckCollinear();
        boolean slopeChecking = checker.areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaChecking = checker.areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by slope method: " + slopeChecking);
        System.out.println("Collinear by area method: " + areaChecking);
    }
    public boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = (int) 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int ab = (y2 - y1)/(x2 - x1);
        int bc = (y3 - y2)/(x3 - x2);
        int ac = (y3 - y1)/(x3 - x1);
        return (ab == bc) && (bc == ac);
    }
}
