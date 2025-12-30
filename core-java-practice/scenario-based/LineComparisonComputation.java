package scenarioBased;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		
//		now we are taking user inputs for the coordinates ( x1, x2, y1, y2 )
		System.out.println("Enter the Coordinates ( x1, x2, y1, y2 ) : ");
		Scanner myScan = new Scanner(System.in);
		int x1 = myScan.nextInt();
		int x2 = myScan.nextInt();
		int y1 = myScan.nextInt();
		int y2 = myScan.nextInt();
		
//		now we are going to calculate the length of lines
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of Line is : " + length);
	}

}
