

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The total miles is: " + miles + " miles for the given " + kilometers + " km");
    }
}
