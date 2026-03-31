package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInputString = myScan.nextLine();
        String reversedString = "";
        for (int i = userInputString.length() - 1; i >= 0; i--) {
            reversedString += userInputString.charAt(i);
        }
        System.out.println("Reversed String: " + reversedString);
    }
}
