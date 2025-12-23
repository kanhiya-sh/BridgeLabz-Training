
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = my_sc.nextLine();
        for (int i = 0; i < userInputString.length(); i++) {
            char ch = userInputString.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                    System.out.println(ch + " : Vowel");
                } 
                else {
                    System.out.println(ch + " : Consonant");
                }
            } 
            else {
                System.out.println(ch + " : Not a Letter");
            }
        }
    }
}
