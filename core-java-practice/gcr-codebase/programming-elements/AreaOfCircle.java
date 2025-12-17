package Capgemini_Day_2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = 3.14 * (radius * radius);
        System.out.println(area);
    }
}
