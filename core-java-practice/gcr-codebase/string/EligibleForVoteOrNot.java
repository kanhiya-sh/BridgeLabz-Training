
import java.util.Scanner;

public class EligibleForVoteOrNot {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int inputStudents = my_scan.nextInt();
        int[] ages = generateAge(inputStudents);
        String[][] votingResult = isVotingPossible(ages);
        displayResult(votingResult);
    }
    public static int[] generateAge(int inputStudents) {
        int[] age = new int[inputStudents];
        for (int i = 0; i < inputStudents; i++) {
            age[i] = (int) (Math.random() * 90) + 10; // here we are generating random age between 10 and 99
        }
        return age;
    }
    public static String[][] isVotingPossible(int[] age) {
        String[][] canVote = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {
            canVote[i][0] = String.valueOf(age[i]);
            if (age[i] < 0) {
                canVote[i][1] = "false";
            } 
            else if (age[i] >= 18) {
                canVote[i][1] = "true";
            } 
            else {
                canVote[i][1] = "false";
            }
        }
        return canVote;
    }
    private static void displayResult(String[][] votingResult) {
        for (int i = 0; i < votingResult.length; i++) {
            System.out.println(votingResult[i][0] + "\t" + votingResult[i][1]);
        }
    }
}
