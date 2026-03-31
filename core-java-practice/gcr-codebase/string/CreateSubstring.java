
import java.util.Scanner;

public class CreateSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter the start index: ");
        int start = sc.nextInt();
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();
        String substringUsingCharAt = createSubstringUsingCharAt(mainStr, start, end);
        String substringUsingBuiltIn = mainStr.substring(start, end);
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
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
