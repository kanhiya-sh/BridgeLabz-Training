package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInputString = myScan.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String wordToBeReplaced = myScan.nextLine();
        System.out.println("Enter the new word: ");
        String newWord = myScan.nextLine();
        String modifiedString = userInputString.replace(wordToBeReplaced, newWord);
        System.out.println("Modified Sentence: " + modifiedString);
    }
}
