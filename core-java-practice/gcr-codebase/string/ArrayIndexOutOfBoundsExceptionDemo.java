

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Names Count - ");
        int count = sc.nextInt();
        sc.nextLine();

        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + "- ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n-- Generating Exception --");
        String name = names[names.length];

        System.out.println("\n-- Handling Exception --");
        handleArrayIndexException(names);

    }

    // here we are writing a Method to handle exception
    public static void handleArrayIndexException(String[] nameArr) {
        try {
            String name = nameArr[nameArr.length];
            System.out.println("Name: " + name);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Found ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Found generic RuntimeException: " + e.getMessage());
        }
    }
}