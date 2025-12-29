package Capgemini_Day10_ScenarioBased;

import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;
        while (true) {
            System.out.print("Enter your age (or -1 to exit): ");
            int age = myScan.nextInt();
            if (age == -1) {
                break;
            }
            if (age < 18) {
                System.out.println("You are not eligible to vote.");
                continue;
            }

            System.out.print("Enter your vote (1, 2, or 3 for candidates): ");
            int vote = myScan.nextInt();
            switch (vote) {
                case 1:
                    candidate1Votes++;
                    System.out.println("Vote recorded for Candidate 1");
                    break;
                case 2:
                    candidate2Votes++;
                    System.out.println("Vote recorded for Candidate 2");
                    break;
                case 3:
                    candidate3Votes++;
                    System.out.println("Vote recorded for Candidate 3");
                    break;
                default: // if the vote is not 1, 2, or 3
                    System.out.println("Invalid vote. Please enter 1, 2, or 3.");
            }
        }

        System.out.println("Final Vote Counts for : ");
        System.out.println("Candidate 1 is : " + candidate1Votes + " votes");
        System.out.println("Candidate 2 is : " + candidate2Votes + " votes");
        System.out.println("Candidate 3 is : " + candidate3Votes + " votes");
    }
}
