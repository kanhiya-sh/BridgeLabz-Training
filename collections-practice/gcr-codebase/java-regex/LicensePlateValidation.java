package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class LicensePlateValidation {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Plate No. to Match");
        String plate = myScan.next();
        System.out.println(plate.matches("^[A-Z]{2}[0-9]{4}$"));
    }
}
