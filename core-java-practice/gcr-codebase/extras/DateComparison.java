package extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // format for showing the result 
        
//        now asking user to input the first date 
        System.out.println("Enter First Date: ");
        String userInput1 = myScan.nextLine();
        LocalDate date1 = LocalDate.parse(userInput1, format);
        
//      now asking user to input the second date 
        System.out.println("Enter First Date: ");
        String userInput2 = myScan.nextLine();
        LocalDate date2 = LocalDate.parse(userInput2, format);
      
//      Comparing both the dates 
        if (date1.isBefore(date2)) {
        	System.out.println("First date is BEFORE the second date");
        } 
        else if (date1.isAfter(date2)) {
        	System.out.println("First date is AFTER the second date");
        } 
        else if (date1.isEqual(date2)) {
        	System.out.println("Both dates are SAME");
        }
	}
}
