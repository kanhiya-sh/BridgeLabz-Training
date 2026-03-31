
import java.util.Scanner;

public class CountOfVowelsAndConsonant {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = my_sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < userInputString.length(); i++) {
            char ch = userInputString.charAt(i);
            // Converting uppercase to lowercase using ASCII values
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            // Checking if char is a letter or not
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);
    
    }
}
