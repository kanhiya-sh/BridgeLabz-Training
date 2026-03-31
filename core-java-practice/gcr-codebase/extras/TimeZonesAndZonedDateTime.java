package extras;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesAndZonedDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		first we are making the formatter of how we are going to display our date and time 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
		
//		now we will find date and time in GMT 
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
		
//		now we will be finding the current date and time in IST
		ZonedDateTime indianST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		
//		now we will be finding the current date and time PST
		ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		
//		now we will be displaying all these date and times 
		
		System.out.println("Date and Time in GMT are : " + gmt.format(format));
		System.out.println("Date and Time in IST are : " + indianST.format(format));
		System.out.println("Date and Time in PST are : " + pst.format(format)); // here it is showing like GMT-8:00 because PST is 8 hours behind GMT, therefore it displays it as GMT-08:00.
		
	}

}
