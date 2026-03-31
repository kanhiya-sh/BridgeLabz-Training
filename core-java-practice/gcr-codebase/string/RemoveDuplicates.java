package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInputString = myScan.nextLine();
        String stringWithoutDuplicates = "";
        for (int i = 0; i < userInputString.length(); i++) {
            char ch = userInputString.charAt(i);
            if (stringWithoutDuplicates.indexOf(ch) == -1) {
                stringWithoutDuplicates += ch;
            }
        }
        System.out.println("String after removing duplicates: " + stringWithoutDuplicates);
    }
}
