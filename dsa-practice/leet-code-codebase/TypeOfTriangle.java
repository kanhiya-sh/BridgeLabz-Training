package BridgeLabz_Day27_Leetcode;

import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int a = myScan.nextInt();
        int b = myScan.nextInt();
        int c = myScan.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("none");
            return;
        }
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
