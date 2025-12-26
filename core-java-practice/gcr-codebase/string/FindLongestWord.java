package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class FindLongestWord {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInputString = myScan.nextLine();
        String[] words = userInputString.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
}
