
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = my_scan.nextInt();
        my_scan.nextLine();

        String[][] gameData = new String[games][3];

        int userWin = 0;
        int computerWin = 0;

        for (int i = 0; i < games; i++) {

            System.out.print("Enter choice (rock/paper/scissors): ");
            String userChoice = my_scan.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWin++;
            else if (winner.equals("Computer"))
                computerWin++;

            gameData[i][0] = userChoice;
            gameData[i][1] = computerChoice;
            gameData[i][2] = winner;
        }

        String[][] stats = calculateResults(userWin, computerWin, games);
        display(gameData, stats);

    }
    public static String getComputerChoice() {
        int compChoice = (int)(Math.random() * 3);
        if (compChoice == 0)
            return "rock";
        else if (compChoice == 1)
            return "paper";
        else
            return "scissors";
    }
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }
        else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win!";
        }
        else {
            return "Computer wins!";
        }
    }
    public static String[][] calculateResults(int userWins, int computerWins, int totalGames){
        String[][] results = new String[2][3];

        results[0][0] = "User";
        results[0][1] = String.valueOf(userWins);
        results[0][2] = String.valueOf((userWins * 100) / totalGames);

        results[1][0] = "Computer";
        results[1][1] = String.valueOf(computerWins);
        results[1][2] = String.valueOf((computerWins * 100) / totalGames);

        return results;
    }

    public static void display(String[][] games, String[][] stats) {

        System.out.println("\nGame  User   Computer   Winner");
        System.out.println("--------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "     " +
                    games[i][0] + "     " +
                    games[i][1] + "        " +
                    games[i][2]);
        }

        System.out.println("\nFinal Result");
        System.out.println("Player   Wins   Win %");
        System.out.println("----------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "     " +
                    stats[i][1] + "      " +
                    stats[i][2] + "%");
        }
    }
}
