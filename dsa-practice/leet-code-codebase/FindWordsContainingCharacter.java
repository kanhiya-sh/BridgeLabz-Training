package BridgeLabz_Day29_Leetcode;

import java.util.*;
public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "fig", "grape"};
        char chr = 'a';
        List<Integer> ll = findWords(words, chr);
        System.out.println(ll);
    }
    public static List<Integer> findWords(String[] words, char chr) {
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf(chr) != -1) {
                ll.add(i);
            }
        }
        return ll;
    }
}