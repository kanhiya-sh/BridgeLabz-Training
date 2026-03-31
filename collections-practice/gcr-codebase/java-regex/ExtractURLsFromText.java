package BridgeLabz_Day34_Regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractURLsFromText {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence to Extract the URLs");
        String sentence = myScan.nextLine();
        String regex = "https?://[^\\s]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println("URL: " + matcher.group());
        }
    }
}
