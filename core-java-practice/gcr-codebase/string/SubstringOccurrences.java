package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String mainString = myScan.nextLine();
        System.out.println("Enter the substring to search for: ");
        String subString = myScan.nextLine();
        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times in the main string.");
    }
}
