package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the String You Want To Match");
        String username = myScan.next();
        System.out.println(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"));
    }
}
