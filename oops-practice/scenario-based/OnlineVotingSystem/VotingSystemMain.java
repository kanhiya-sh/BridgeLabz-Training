package BridgeLabz_Day22_ScenarioBased_OOPS.OnlineVotingSystem;

import java.util.*;

public class VotingSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingSystem vs = new VotingSystem();
        vs.addCandidate("BJP");
        vs.addCandidate("Congress");
        vs.addCandidate("AAP");
        while(true) {
            System.out.println("\n--- ONLINE VOTING SYSTEM ---");
            System.out.println("1. Register Voter");
            System.out.println("2. Cast Vote");
            System.out.println("3. Add New Candidate");
            System.out.println("4. Declare Results");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter Name : ");
                    String vName = sc.next();
                    System.out.print("Enter Voter ID : ");
                    String vID = sc.next();
                    vs.registerVoter(vName, vID);
                    break;

                case 2:
                    System.out.print("Enter Your Voter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Candidate Name (BJP/Congress/AAP) : ");
                    String cName = sc.next();
                    try {
                        vs.castVote(id, cName);
                    }
                    catch (DuplicateVoteException e) {
                        System.out.println("EXCEPTION : " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter Candidate Name : ");
                    vs.addCandidate(sc.next());
                    break;

                case 4:
                    vs.displayResults();
                    break;

                case 5:
                    System.out.println("Election Closed.");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
