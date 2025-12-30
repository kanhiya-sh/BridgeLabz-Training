package scenarioBased;

public class SnakeandLadder {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Snake and Ladder Game");
        
        // Players initial positions
        int player1Position = 0;
        int player2Position = 0;
        
        // Track whose turn it is (true for Player 1, false for Player 2)
        boolean isPlayer1Turn = true; 
        
        int totalDiceRolls = 0;
        
        // Game continues until one of them reaches 100
        while(player1Position < 100 && player2Position < 100) { 
            
            String currentPlayer = isPlayer1Turn ? "Player 1" : "Player 2";
            int currentPosition = isPlayer1Turn ? player1Position : player2Position;
            
            System.out.println("\nTurn: " + currentPlayer + " (Position: " + currentPosition + ")");
            
            // Rolling the dice
            int dice = (int)(Math.random() * 6) + 1;
            System.out.println("Dice rolled : " + dice);
            totalDiceRolls++;
            
            // Checking for options
            int options = (int)(Math.random() * 3); 
            // 0 - No Play, 1 - Ladder, 2 - Snake
            
            if(options == 0) {
	            	// Position remains same
                System.out.println("Option: No Play (Stay at same position)");
            }
            else if (options == 1) {
                System.out.println("Option: Ladder !! (You Moved ahead)");
                if(currentPosition + dice <= 100) {
                    currentPosition += dice;
                } 
                else {
                    System.out.println("Got Ladder but cannot move as position would exceed 100");
                }
            }
            else if (options == 2) {
                System.out.println("Option: Bitten by Snake !! (Move back)");
                currentPosition -= dice;
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
            }
            
            // Update the actual position of the playing player
            if (isPlayer1Turn) {
                player1Position = currentPosition;
                System.out.println("Player 1 New Position: " + player1Position);
            } else {
                player2Position = currentPosition;
                System.out.println("Player 2 New Position: " + player2Position);
            }
            
            // Checking winning condition
            if (currentPosition == 100) {
                System.out.println("----------------------");
                System.out.println("CONGRATULATIONS! " + currentPlayer + " WON THE GAME!");
                break; // Break the loop immediately
            }

            // Turn switching
            // If Option is Ladder (1), user plays again 
            if (options == 1) {
                System.out.println("User got Ladder! Plays again.");
            } 
            else {
	            	if (isPlayer1Turn == true) {
						isPlayer1Turn = false;
					} 
	            	else {
						isPlayer1Turn = true;  
					}
	            }
        		}
       
        System.out.println("Game Finished!");
        System.out.println("Total Dice Rolls in the game: " + totalDiceRolls);
    }
}