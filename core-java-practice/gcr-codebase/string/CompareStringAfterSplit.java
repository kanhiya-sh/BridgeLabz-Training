

import java.util.Scanner;

public class CompareStringAfterSplit {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInputString = myScan.nextLine();

        // ---------- Manual split using charAt() ----------
        int wordCounter = 1;
        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) == ' ') {
                wordCounter++;
            }
        }

        String[] manuallyMakingWords = new String[wordCounter];
        int index = 0;
        String word = "";

        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) != ' ') {
                word = word + userInputString.charAt(i);
            } else {
                manuallyMakingWords[index++] = word;
                word = "";
            }
        }
        manuallyMakingWords[index] = word;

        // now we will do split using built-in function
        String[] builtInWords = userInputString.split(" ");

//       now we will compare both the arrays
        boolean same = true;

        if (manuallyMakingWords.length != builtInWords.length) {
            same = false;
        }
        else {
            for (int i = 0; i < manuallyMakingWords.length; i++) {
                if (!manuallyMakingWords[i].equals(builtInWords[i])) {
                    same = false;
                    break;
                }
            }
        }

        // ---------- Output ----------
        System.out.println("Manual split result: ");
        for (int i = 0; i < manuallyMakingWords.length; i++) {
            System.out.println(manuallyMakingWords[i]);
        }

        System.out.println("Built-in split result: ");
        for (int i = 0; i < builtInWords.length; i++) {
            System.out.println(builtInWords[i]);
        }

        System.out.println("Are Both results same ? " + same);
    }
}
