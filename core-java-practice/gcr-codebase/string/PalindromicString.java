
import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = my_scan.nextLine();
        String reversedString = "";
        for (int i = userInputString.length() - 1; i >= 0; i--) {
            reversedString += userInputString.charAt(i);
        }
        if (userInputString.equals(reversedString)) {
            System.out.println(userInputString + " is a Palindromic String");
        }
        else {
            System.out.println(userInputString + " is not a Palindromic String");
        }
    }
}
