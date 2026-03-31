package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class HexColorCodeValidation {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Color Code to Match");
        String color = myScan.next();
        System.out.println(color.matches("^#[0-9A-Fa-f]{6}$"));
    }
}
