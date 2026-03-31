

import java.util.Scanner;

public class UppercaseConversionComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String upperCaseUsingLoop = convertToUppercaseUsingLoop(userInput);
        String upperCaseUsingMethod = userInput.toUpperCase();
        System.out.println("Uppercase using loop: " + upperCaseUsingLoop);
        System.out.println("Uppercase using built-in method: " + upperCaseUsingMethod);
        boolean areEqual = compareStrings(upperCaseUsingLoop, upperCaseUsingMethod);
        System.out.println("Are both uppercase strings equal? " + areEqual);
    }
    public static String convertToUppercaseUsingLoop(String str) {
        StringBuilder upperCaseStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - ('a' - 'A'));
            }
            upperCaseStr.append(ch);
        }
        return upperCaseStr.toString();
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
