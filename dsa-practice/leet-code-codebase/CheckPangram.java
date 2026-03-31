package BridgeLabz_Day23_Leetcode;

import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            seen[sentence.charAt(i) - 'a'] = true;
        }
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}
