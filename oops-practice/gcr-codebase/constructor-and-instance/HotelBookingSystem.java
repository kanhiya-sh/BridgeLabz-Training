package constructorAndInstance;

class HotelBooking {
	
    String guestName;
    String roomType;
    int nights;

    // this is the default constructor
    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // this is the parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // this is the copy constructor
    HotelBooking(HotelBooking h) {
    		this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }
}

public class HotelBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
