package BridgeLabz_Day28_ScenarioBased.CinemaTime;

import java.util.Scanner;
public class CinemaTimeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieManager manager = new MovieManager();
        int choice;
        do {
            System.out.println("\n1.Add Movie");
            System.out.println("2.Search Movie");
            System.out.println("3.Display All Movies");
            System.out.println("4.Print Report");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Movie Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Show Time (HH:MM): ");
                        String time = sc.nextLine();
                        manager.addMovie(title, time);
                        break;

                    case 2:
                        System.out.print("Enter Keyword: ");
                        manager.searchMovie(sc.nextLine());
                        break;

                    case 3:
                        manager.displayAllMovies();
                        break;

                    case 4:
                        manager.printReport();
                        break;

                    case 0:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        while (choice != 0);
    }
}
