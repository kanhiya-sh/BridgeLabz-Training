
import java.util.Scanner;

public class FindUniqueCharactersUsingMethod {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = my_scan.nextLine();
        System.out.println("Unique characters:");

        for (int i = 0; i < userInput.length(); i++) {
            char current = userInput.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < userInput.length(); j++) {
                if (i != j && current == userInput.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(current + " ");
            }
        }
    }
}
