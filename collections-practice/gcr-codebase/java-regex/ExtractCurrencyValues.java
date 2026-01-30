package BridgeLabz_Day34_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence to Extract Currency");
        String sentence = myScan.nextLine();
        String regex = "\\$?\\d+(\\.\\d{2})?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()) {
            System.out.println("Currency Values : " + matcher.find());
        }
    }
}
