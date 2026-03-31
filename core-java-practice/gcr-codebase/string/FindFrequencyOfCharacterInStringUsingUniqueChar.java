
import java.util.Scanner;

public class FindFrequencyOfCharacterInStringUsingUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInputString = sc.nextLine();
        String[][] result = characterFrequency(userInputString);
        display(result);
    }
    public static char[] uniqueCharacters(String userInputString) {
        char[] temp = new char[userInputString.length()];
        int index = 0;
        for (int i = 0; i < userInputString.length(); i++) {
            char currentIdx = userInputString.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (currentIdx == userInputString.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index++] = currentIdx;
            }
        }
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }
    // Method to calculate frequency
    public static String[][] characterFrequency(String userInputString) {
        int[] frequency = new int[256];
        for (int i = 0; i < userInputString.length(); i++) {
            frequency[userInputString.charAt(i)]++;
        }
        char[] uniqueChars = uniqueCharacters(userInputString);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        return result;
    }
    // Method to display resultt
    public static void display(String[][] result) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}
