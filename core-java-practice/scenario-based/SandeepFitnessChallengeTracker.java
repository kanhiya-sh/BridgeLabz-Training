package scenarioBased;

import java.util.*;

public class SandeepFitnessChallengeTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		int counts = 0;
		int i = 7;
		while ( i > 0 ) {
			System.out.println("Is this the rest Day ? (yes/no) : ");
			String userResponse = myScan.next();
			if((userResponse.equalsIgnoreCase("yes"))) {
				i--;
				continue;
			}
			System.out.println("Enter number of Pushups : ");
			int userInput = myScan.nextInt();
			counts += userInput;
			i--;
		}
		System.out.println("Total Number of Pushups are : " + counts);
	}

}
