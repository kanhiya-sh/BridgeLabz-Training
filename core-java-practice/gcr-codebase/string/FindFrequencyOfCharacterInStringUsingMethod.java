

import java.util.Scanner;

public class FindFrequencyOfCharacterInStringUsingMethod {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = myScan.nextLine();
        boolean[] visited = new boolean[userInputString.length()];
        System.out.println("Character Frequency:");
        for (int i = 0; i < userInputString.length(); i++) {
            if (visited[i]) {
                continue;
            }
            char current = userInputString.charAt(i);
            int count = 1;
            for (int j = i + 1; j < userInputString.length(); j++) {
                if (current == userInputString.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(current + " : " + count);
        }
    }
}
