

import java.util.*;

public class CheckAnagrams {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = myScan.nextLine().toLowerCase().replace(" ", "");
//  in this line, we convert the string to lowercase and remove spaces to ensure accurate comparison
        System.out.print("Enter the second string: ");
        String secondString = myScan.nextLine().toLowerCase().replace(" ", "");
        if (firstString.length() != secondString.length()) {
            System.out.println("Strings are not anagrams.");
            return;
        }
        String firstSorted = sortString(firstString);
        String secondSorted = sortString(secondString);
        if (firstSorted.equals(secondSorted)) {
            System.out.println("Strings are anagrams.");
        }
        else {
            System.out.println("Strings are not anagrams.");
        }
    }
    public static String sortString(String input) {
        char[] ch = input.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
