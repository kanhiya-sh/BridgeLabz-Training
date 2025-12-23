

import java.util.Scanner;

public class FindFrequencyOfCharacterInStringUsingNestedLoops {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = myScan.nextLine();
        System.out.println("Character Frequency:");
        for (int i = 0; i < userInputString.length(); i++) {
            char currentIdx = userInputString.charAt(i);
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (currentIdx == userInputString.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < userInputString.length(); j++) {
                    if (currentIdx == userInputString.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(currentIdx + " : " + count);
            }
        }
    }
}
