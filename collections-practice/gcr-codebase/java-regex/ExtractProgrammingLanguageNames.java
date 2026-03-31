package BridgeLabz_Day34_Regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractProgrammingLanguageNames {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence to Extract the Programming Language");
        String sentence = myScan.nextLine();
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println("Programming Languages : " + matcher.group());
        }
    }
}
