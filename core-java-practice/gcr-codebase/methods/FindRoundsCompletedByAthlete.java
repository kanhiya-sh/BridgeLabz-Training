import java.util.*;

public class FindRoundsCompletedByAthlete {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter all the three sides : ");
		int firstSide = myScan.nextInt();
		int secondSide = myScan.nextInt();
		int thirdSide = myScan.nextInt();
		FindRoundsCompletedByAthlete findR = new FindRoundsCompletedByAthlete();
		int findRounds = findR.findRoundsByAthlete(firstSide, secondSide, thirdSide);
		System.out.println(findRounds);
	}
	public int findRoundsByAthlete(int firstSide, int secondSide, int thirdSide){
		int perimeter = firstSide + secondSide + thirdSide;
		int distance = 5;
		double rounds = Math.ceil((distance * 1000 )/perimeter); // converting Km to m 
		return (int)rounds;
	}
}
	