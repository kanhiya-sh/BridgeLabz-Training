

import java.util.Scanner;

public class LowercaseConversionComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String lowerCaseUsingLoop = convertToLowercaseUsingLoop(originalString);
        String lowerCaseUsingMethod = originalString.toLowerCase();
        System.out.println("Lowercase using loop: " + lowerCaseUsingLoop);
        System.out.println("Lowercase using method: " + lowerCaseUsingMethod);
        boolean areEqual = compareStrings(lowerCaseUsingLoop, lowerCaseUsingMethod);
        System.out.println("Are both lowercase strings equal? " + areEqual);
    }
    public static String convertToLowercaseUsingLoop(String str) {
        StringBuilder lowerCaseStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + ('a' - 'A'));
            }
            lowerCaseStr.append(ch);
        }
        return lowerCaseStr.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
