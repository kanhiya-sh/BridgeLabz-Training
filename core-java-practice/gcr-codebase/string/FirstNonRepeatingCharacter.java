

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = my_scan.nextLine();

        char result = '\0'; // Null character
        boolean found = false;

        for (int i = 0; i < userInputString.length(); i++) {
            char currentIdx = userInputString.charAt(i);
            boolean isRepeating = false;
            for (int j = 0; j < userInputString.length(); j++) {
                if (i != j && currentIdx == userInputString.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                result = currentIdx;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
