package BridgeLabz_Day25_Leetcode;

import java.util.Scanner;

public class MaximumNumberWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] sentence = new String[n];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentence[i] = sc.nextLine();
        }
        int result = maxFoundWords(sentence);
        System.out.println("Maximum number of words in a sentence is : " + result);
    }
    public static int maxFoundWords(String[] sentence) {
        int maxWords = 0;
        for (String s : sentence) {
            int words = 1;
            for (char c : s.toCharArray()) {
                if (c == ' ') words++;
            }
            maxWords = Math.max(maxWords, words);
        }
        return maxWords;
    }
}
