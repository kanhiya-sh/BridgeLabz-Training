package scenarioBased;

public class SnakeandLadder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game");
		
		int Position = 0;
		System.out.println("Player starts at position " + Position);
		
//		now we are rolling the dice and using random the number between 1 to 6 is getting selected 
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("Dice rolled : " + dice);

	}

}
