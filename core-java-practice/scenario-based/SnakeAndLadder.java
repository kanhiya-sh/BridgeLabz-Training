package scenarioBased;

public class SnakeandLadder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game");
		
		int position = 0;
		System.out.println("Player starts at position " + position);
		
//		now we are rolling the dice and using random the number between 1 to 6 is getting selected 
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("Dice rolled : " + dice);
		
//		now we are setting position for the user that where they will move to their position
		int options = (int)(Math.random() * 3); 
		System.out.println("You got the option : " + options);
		// 0 - for no play , 1 - ladder , 2 - snake bite 
		switch(options) {
		case 0 :
			System.out.println("No Play");
			break;
		case 1 :
			position += dice ;
			System.out.println("You Found a Ladder!! Moved to " + position);
			break;
		case 2 :
			position -= dice;
			 System.out.println("Bitten by Snake!! Move back to " + position);
			 break;
		}

	}

}
