package scenarioBased;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		
//		now we are taking user inputs for the coordinates ( x1, x2, y1, y2 )
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter the Coordinates of line 1 ( x1, x2, y1, y2 ) : ");
//		line 1 coordinates
		int x1 = myScan.nextInt();
		int x2 = myScan.nextInt();
		int y1 = myScan.nextInt();
		int y2 = myScan.nextInt();
		
		System.out.println("Enter the Coordinates of line 2 ( m1, m2, n1, n2 ) : ");

//		line 2 coordinates
		int m1 = myScan.nextInt();
		int m2 = myScan.nextInt();
		int n1 = myScan.nextInt();
		int n2 = myScan.nextInt();
		
//		now we are going to calculate the length of lines
		Double line1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		Double line2 = Math.sqrt(Math.pow(m2 - m1, 2) + Math.pow(n2 - n1, 2));
		
		if(Double.valueOf(line1).equals(line2)) {
			System.out.println("Both lines are equal");
        } 
		else {
            System.out.println("Both lines are not equal");
		}
		
	}

}
