

import java.util.Scanner;

public class SplitTheStringAndStoreIn2DArray {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = myScan.nextLine();

        // -------- count words --------
        int wordCount = 1;
        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // -------- store words --------
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";
        for (int i = 0; i < userInputString.length(); i++) {
            if (userInputString.charAt(i) != ' ') {
                word = word + userInputString.charAt(i);
            } 
            else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;
        
        // creating the 2d array which includes words and their lengths
        String[][] result = new String[wordCount][2];
        for (int i = 0; i < wordCount; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        // Displaying the 2D array
        System.out.println("Word  Length");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
}
