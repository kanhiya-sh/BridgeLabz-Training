import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (min 6 chars): ");
        String userInputString = scanner.next();

        System.out.println("\n=== Generating Exception ===");
        // Uncomment below line to see exception
        // generateIllegalArgumentException(userInputString);

        System.out.println("\n=== Handling Exception ===");
        handleIllegalArgumentException(userInputString);
    }

    public static void generateIllegalArgumentException(String inputText) {
        // Start index greater than end index
        String sub = inputText.substring(5, 2);
    }

    // Method to handle exception
    public static void handleIllegalArgumentException(String inputText) {
        try {
            String sub = inputText.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}
