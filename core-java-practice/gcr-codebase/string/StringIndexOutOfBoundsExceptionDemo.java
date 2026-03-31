

import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        System.out.println("\n=== Generating Exception ===");
        // Uncomment below line to see exception
        // generateStringIndexException(userInput);

        System.out.println("\n=== Handling Exception ===");
        handleStringIndexException(userInput);
    }
    public static void generateStringIndexException(String inputText) {
        // Accessing index beyond string length
        char ch = inputText.charAt(inputText.length());
    }

    // Method to handle exception
    public static void handleStringIndexException(String inputText) {
        try {
            char ch = inputText.charAt(inputText.length());
            System.out.println("Character: " + ch);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

}
