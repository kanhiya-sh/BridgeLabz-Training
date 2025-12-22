
import java.util.Scanner;
public class CharacterArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.next();

        // Get characters using user-defined method
        char[] manualCharArray = getCharactersManually(userInput);

        // Get characters using built-in method
        char[] builtInCharArray = userInput.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharacterArrays(manualCharArray, builtInCharArray);

        // Display results
        System.out.println("\nManual character array: ");
        for (char ch : manualCharArray) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nBuilt-in toCharArray(): ");
        for (char ch : builtInCharArray) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nArrays are equal: " + areEqual);
    }
    // Method to get characters manually using charAt()
    public static char[] getCharactersManually(String inputText) {
        char[] characters = new char[inputText.length()];
        for (int i = 0; i < inputText.length(); i++) {
            characters[i] = inputText.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharacterArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
