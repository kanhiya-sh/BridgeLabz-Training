package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class CheckAnagramsString {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String firstString = myScan.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.println("Enter the second string: ");
        String secondString = myScan.nextLine().replaceAll("\\s", "").toLowerCase();
        if (firstString.length() != secondString.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < firstString.length(); i++) {
            charCount[firstString.charAt(i) - 'a']++;
            charCount[secondString.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }
        System.out.println("The strings are anagrams.");
    }
}
