package BridgeLabz_Day34_Regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractDates {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence to Extract the Dates");
        String sentence = myScan.nextLine();
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println("Date: " + matcher.group());
        }
    }
}
