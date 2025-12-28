package extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateArithmetic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter date in (dd-MM-yyyy): ");
        String input = myScan.nextLine();
        
     //	we are making the formatter of how we are going to display our date
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
     // Converting String to LocalDate
        LocalDate date = LocalDate.parse(input, format);

     // now adding 7 days to the date
        date = date.plusDays(7);

     //now adding 1 month to the date
        date = date.plusMonths(1);

     // now adding 2 years to the date
        date = date.plusYears(2);

     //now subtracting 3 weeks from the final date
        date = date.minusWeeks(3);

        System.out.println("Final Date after calculations: " + date.format(format));

	}

}
