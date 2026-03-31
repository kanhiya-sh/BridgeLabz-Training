package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInputString = myScan.nextLine();
        String toggledString = "";
        for (int i = 0; i < userInputString.length(); i++) {
            char ch = userInputString.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString += Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)) {
                toggledString += Character.toUpperCase(ch);
            }
            else {
                toggledString += ch; // Non-alphabetic characters remain unchanged
            }
        }
        System.out.println("Toggled Case String: " + toggledString);
    }
}
