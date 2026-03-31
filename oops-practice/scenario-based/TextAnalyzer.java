package Capgemini_Day16_ScenarioBased;

import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your Paragraph : ");
        String para = myScan.nextLine();
        if (para.trim().length() == 0) {
            System.out.println("para is empty");
            return;
        }
        String[] words = para.trim().split("\\s+");
        int wordCount = words.length;
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Word Count is : " + wordCount);
        System.out.println("Longest Word is : " + longestWord);
        System.out.print("Enter word to replace : ");

        String oldWord = myScan.next();
        System.out.print("Enter the new word : ");
        String newWord = myScan.next();
        String result = para.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
        System.out.println("Updated para is : ");
        System.out.println(result);
    }
}
