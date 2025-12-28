package extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now(); // this is for getting the current date 
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // 1st format
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 2nd format
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy"); // 3rd format
        
//        displaying all three formats 
        System.out.println("In (dd/MM/yyyy): " + currentDate.format(format1));
        System.out.println("In (yyyy-MM-dd): " + currentDate.format(format2));
        System.out.println("In (EEE, MMM dd, yyyy): " + currentDate.format(format3));
        
	}
}
