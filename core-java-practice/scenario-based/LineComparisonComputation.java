package scenarioBased;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
	
//		now we are going to calculate the length of lines
		Double line1 = LengthOfLine(1);
		Double line2 = LengthOfLine(2);
		
		System.out.println("The length of line 1 is : " + line1);
		System.out.println("The length of line 2 is : " + line2);

		
		if(Double.valueOf(line1).equals(line2)) { 
			System.out.println("Both lines are equal in length");
        } 
		else {
            System.out.println("Both lines are not equal");
		}
		
//		now we are comparing both the lines based on their end points
		
		int result = line1.compareTo(line2);
		
		if(result == 0) {
            System.out.println("After comparing we found that both lines are equal");
		}
		else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
		}
		else {
			System.out.println("Line 1 is smaller than Line 2");
		}
		
	}

	public static Double LengthOfLine(int i) {
		
		Scanner myScan = new Scanner(System.in);
//		now we are taking user inputs for the coordinates ( x1, x2, y1, y2 )
		
		System.out.println("Enter the Coordinates of line " + i + " ( x1, x2, y1, y2 ) : ");
//		line coordinates
		int x1 = myScan.nextInt();
		int x2 = myScan.nextInt();
		int y1 = myScan.nextInt();
		int y2 = myScan.nextInt();
		
		Double lengthLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return lengthLine;
	}

}
