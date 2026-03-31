package BridgeLabz_Day34_Regex;

import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence with Censor Bad Words");
        String sentence = myScan.nextLine();
        String regex = "\\b(damn|stupid)\\b";
        String result = sentence.replaceAll(regex, "****");
        System.out.println(result);
    }
}
