package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class Compare2Strings {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = myScan.nextLine();
        System.out.println("Enter second string: ");
        String string2 = myScan.nextLine();
        int minLength = Math.min(string1.length(), string2.length());
        int comparisonResult = 0;
        for (int i = 0; i < minLength; i++) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);
            if (char1 != char2) {
                comparisonResult = char1 - char2;
                break;
            }
        }
        if (comparisonResult == 0) {
            comparisonResult = string1.length() - string2.length();
        }
        if (comparisonResult < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        }
        else if (comparisonResult > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        }
        else {
            System.out.println("Both strings are equal.");
        }
    }
}
