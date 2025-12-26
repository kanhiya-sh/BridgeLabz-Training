package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInputString = myScan.nextLine();
        String reversedString = "";
        for (int i = userInputString.length() - 1; i >= 0; i--) {
            reversedString += userInputString.charAt(i);
        }
        if (userInputString.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
