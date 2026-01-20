package BridgeLabz_Day28_ScenarioBased;

import java.util.Scanner;

public class BookShelfMain {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Library");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String book = sc.nextLine();
                    library.addBook(genre, book);
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    genre = sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    book = sc.nextLine();
                    library.removeBook(genre, book);
                    break;

                case 3:
                    library.displayLibrary();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}
