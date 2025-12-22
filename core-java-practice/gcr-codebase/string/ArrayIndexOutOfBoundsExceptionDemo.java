

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many names? ");
        int count = sc.nextInt();
        sc.nextLine();

        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n--- Generating Exception ---");
        generateArrayIndexException(names);

        System.out.println("\n--- Handling Exception ---");
        handleArrayIndexException(names);

    }

    public static void generateArrayIndexException(String[] nameArr) {
        // Accessing index beyond array length
        String name = nameArr[nameArr.length];
    }

    // Method to handle exception
    public static void handleArrayIndexException(String[] nameArr) {
        try {
            String name = nameArr[nameArr.length];
            System.out.println("Name: " + name);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
}
