package BridgeLabz_Day28_ScenarioBased.ParcelTracker;

import java.util.Scanner;
public class ParcelTrackerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParcelChain chain = new ParcelChain();
        int choice;
        do {
            System.out.println("\n1.Add Stage");
            System.out.println("2.Add Checkpoint After Stage");
            System.out.println("3.Track Parcel");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Stage Name: ");
                    chain.addStage(sc.nextLine());
                    break;

                case 2:
                    System.out.print("After which stage: ");
                    String after = sc.nextLine();
                    System.out.print("New Checkpoint: ");
                    String stage = sc.nextLine();
                    chain.addAfter(after, stage);
                    break;

                case 3:
                    chain.track();
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (choice != 0);
    }
}
