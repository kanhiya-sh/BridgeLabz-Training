package scenarioBased;

import java.util.*;

public class MovieTicketBookingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		while( true ) {
//			movie type
			System.out.println("Enter your Movie type : ");
			String movieType = myScan.next().toLowerCase();
			switch(movieType) {
			case "action":
				System.out.println("Action Movie");
				break;
			case "thriller":
				System.out.println("thriller Movie");
				break;
			case "comedy":
				System.out.println("comedy Movie");
				break;
			case "horror":
				System.out.println("horror Movie");
				break;
			default :
				System.out.println("Invalid Movie Type");
				break;
			}
	//		seat type 
			System.out.println("Enter your Seat type : ");
			String seatType = myScan.next().toLowerCase();
			switch(seatType) {
			case "silver":
				System.out.println("Silver Seat");
				break;
			case "gold":
				System.out.println("Gold Seat");
				break;
			default :
				System.out.println("Invalid Seat Type");
				break;
			}
	//		snacks type
			System.out.println("Enter Snacks you want (popcorn/cola/pizza) : ");
			String snacksType = myScan.next().toLowerCase();
			switch(snacksType) {
			case "popcorn":
				System.out.println("Popcorn ordered");
				break;
			case "cola":
				System.out.println("Cola ordered");
				break;
			case "pizza":
				System.out.println("Pizza ordered");
				break;
			default :
				System.out.println("Selected Food is not Available");
				break;
			}
			System.out.println("Other Customer ? (yes/no) : ");
			String customerInput = myScan.next();
			if(customerInput.equalsIgnoreCase("no")) {
				break;
			}
		}

	}

}
