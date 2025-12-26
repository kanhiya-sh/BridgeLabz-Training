package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInputString = myScan.nextLine();
        System.out.println("Enter the character to remove: ");
        char charToRemove = myScan.nextLine().charAt(0);
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < userInputString.length(); i++) {
            char currentChar = userInputString.charAt(i);
            if (currentChar != charToRemove) {
                modifiedString.append(currentChar);
            }
        }
        System.out.println("Modified String: " + modifiedString.toString());
    }
}
