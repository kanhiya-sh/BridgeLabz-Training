package scenarioBased;

import java.util.*;

public class RohanLibraryReminderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		int finePerDay = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Book " + i);
//            asking for the due date from user
            System.out.print("Enter due date : ");
            int dueDate = myScan.nextInt();
//            asking for the return date 
            System.out.print("Enter return date : ");
            int returnDate = myScan.nextInt();
//            here if return > due than fine will be charged for extraDay*5
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days, Fine: " + fine);
            } 
            else {
                System.out.println("No fine charged");
            }
            System.out.println();
        }
	}

}
