package BridgeLabz_Day34_Regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence to Extract the Capital Word");
        String sentence = myScan.nextLine();
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println("Word : " + matcher.group());
        }
    }
}
