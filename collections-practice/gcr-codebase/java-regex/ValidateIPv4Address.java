package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class ValidateIPv4Address {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter IP to Validate");
        String ip = myScan.nextLine();
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
                + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        System.out.println(ip.matches(regex));
    }
}
