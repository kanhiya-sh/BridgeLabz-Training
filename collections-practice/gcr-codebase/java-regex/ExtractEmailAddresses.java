package BridgeLabz_Day34_Regex;

import java.util.*;
import java.util.regex.*;

public class ExtractEmailAddresses {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Sentence to Extract the Email");
        String sentence = myScan.nextLine();
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"; // this is the regex to extrac the email from the sentence

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()) {
            System.out.println("Email : " + matcher.group());
        }
    }
}
