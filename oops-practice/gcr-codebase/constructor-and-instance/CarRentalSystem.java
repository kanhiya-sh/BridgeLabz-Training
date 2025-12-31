package constructorAndInstance;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    // constructor to initialize rental details
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double totalCost() {
        return rentalDays * costPerDay;
    }
}


public class CarRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
