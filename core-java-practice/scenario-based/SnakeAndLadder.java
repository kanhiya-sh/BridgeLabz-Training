package scenarioBased;

public class SnakeandLadder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game");
		
		int position = 0;
		System.out.println("Player starts at position " + position);
		
		int totalCount = 0;
		
		while(position < 100) { 
//		now we are rolling the dice and using random the number between 1 to 6 is getting selected 
			int dice = (int)(Math.random() * 6) + 1;
			System.out.println("Dice rolled : " + dice);
			
			totalCount++; // increasing the count every time the dice is played 
	
//		now we are setting position for the user that where they will move to their position
			int options = (int)(Math.random() * 3); 
			System.out.println("You got the option : " + options);
			// 0 - for no play , 1 - ladder , 2 - snake bite 
	
			if(options == 0) {
				System.out.println("No Play");
			}
			if (options == 1) {
				if( position + dice <= 100) {
					position += dice;
					System.out.println("You Found the Ladder! You Moved to " + position);
				}
				else {
					System.out.println("Ladder found but cannot move as you can go beyond 100");
				}
			}
		    else if (options == 2) {
		    		position -= dice;
		    		if (position < 0) {
		    			position = 0;
		    		}
		    		
		        System.out.println("Bitten by Snake! Moved back to " + position);
		    }
			
			System.out.println("Current Position is : " + position);
			System.out.println("----------------------");
		    
		}
		
		System.out.println("Game Finished!");
        System.out.println("Total Dice Rolls : " + totalCount);

	}

}
