package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Card No. to Validate");
        String card = myScan.nextLine();
        String regex = "^(4\\d{15}|5\\d{15})$";
        System.out.println(card.matches(regex));
    }
}
