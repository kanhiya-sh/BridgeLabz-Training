package BridgeLabz_Day23_Leetcode;

import java.util.Scanner;

public class FirstPalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] wordsArr = new String[n];
        for (int i = 0; i < n; i++) {
            wordsArr[i] = sc.nextLine();
        }
        String ans = firstPalindrome(wordsArr);
        System.out.println(ans);
    }
    public static String firstPalindrome(String[] wordsArr) {
        for (String word : wordsArr) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
