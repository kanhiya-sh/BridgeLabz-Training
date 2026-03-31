

import java.util.Scanner;

public class FindTheDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double inYards = distanceInFeet / 3.0;
        double inMiles = distanceInFeet / 5280.0;
        System.out.println("The distance in feet is " + distanceInFeet + " while in yards is " + inYards + " and in miles is " + inMiles);
    }
}
