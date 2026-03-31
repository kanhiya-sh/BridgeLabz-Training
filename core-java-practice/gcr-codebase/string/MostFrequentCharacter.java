package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInputString = myScan.nextLine();
        int maxCount = 0;
        char mostFrequentChar = ' ';
        for (int i = 0; i < userInputString.length(); i++) {
            char ch = userInputString.charAt(i);
            int count = 0;
            for (int j = 0; j < userInputString.length(); j++) {
                if (userInputString.charAt(j) == ch) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = ch;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
