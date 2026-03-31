package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class ValidateSSN {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence to Validate SSN");
        String ssn = myScan.nextLine();
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        System.out.println(ssn.matches(regex));
    }
}
