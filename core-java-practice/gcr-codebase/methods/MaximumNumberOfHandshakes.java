import java.util.*;

public class MaximumNumberOfHandshakes {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int numberOfStudents = myScan.nextInt();
		MaximumNumberOfHandshakes count = new MaximumNumberOfHandshakes();
		int maxNum = count.maxNumOfHandShakes(numberOfStudents);
		System.out.println(maxNum);
	}
	public int maxNumOfHandShakes(int numberOfStudents) {
		int combinations = (numberOfStudents * (numberOfStudents - 1)) / 2 ;
		return combinations;
	}
}