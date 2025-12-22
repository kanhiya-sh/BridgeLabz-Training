
import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to see exception: ");
        String userInputString = sc.next();

        System.out.println("\n--- Generating Exception ---");
         generateNumberFormatException(userInputString);

        System.out.println("\n--- Handling Exception ---");
        handleNumberFormatException(userInputString);
    }
    
    public static void generateNumberFormatException(String inputText) {
        int number = Integer.parseInt(inputText);
    }

    // Method to handle exception
    public static void handleNumberFormatException(String inputText) {
        try {
            int number = Integer.parseInt(inputText);
            System.out.println("Parsed number: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}
