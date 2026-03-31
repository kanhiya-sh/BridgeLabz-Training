

import java.util.Scanner;
public class TrimLeadingAndTrailingSpaces {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputStr = my_scan.nextLine(); // taking the input of the user with spaces
        int startIndex = 0;
        int endIndex = inputStr.length() - 1;
//        removing the leading spaces
        while (startIndex <= endIndex && inputStr.charAt(startIndex) == ' ') {
            startIndex++;
        }
//        removing the trailing spaces
        while (endIndex >= startIndex && inputStr.charAt(endIndex) == ' ') {
            endIndex--;
        }
        String finalTrimmedString = "";
        for (int i = startIndex; i <= endIndex; i++) {
            finalTrimmedString += inputStr.charAt(i);
        }
        System.out.println("Final String: '" + finalTrimmedString + "'");
    }
}
