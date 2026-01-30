package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence with Multiple Spaces");
        String sentence = myScan.nextLine();
        String result = sentence.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
