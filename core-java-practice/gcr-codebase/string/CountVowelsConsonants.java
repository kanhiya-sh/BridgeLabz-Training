package Capgemini_Day9_String_Extras;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInputString = myScan.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < userInputString.length(); i++) {
            char ch = userInputString.charAt(i);
            // Converting uppercase to lowercase using ASCII values
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            // Checking if char is a letter or not
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);
    }
}
