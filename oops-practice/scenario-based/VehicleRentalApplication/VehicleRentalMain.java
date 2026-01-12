package BridgeLabz_Day22_ScenarioBased_OOPS.VehicleRentalApplication;
import java.util.*;

public class VehicleRentalMain {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bike("UP14-55", "Splendor"));
        vehicles.add(new Car("DL01-99", "Swift"));
        while (true) {
            System.out.println("\n--- Vehicle Rental ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View & Rent Vehicle");
            System.out.println("3. Update Vehicle Model");
            System.out.println("4. Remove Vehicle");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            int ch = myScan.nextInt();
            switch (ch) {
                // --- CREATE ---
                case 1:
                    System.out.println("Press - 1. Bike, 2. Car, 3. Truck");
                    int type = myScan.nextInt();
                    System.out.print("Enter Number Plate ID : ");
                    String no = myScan.next();
                    System.out.print("Enter Model : ");
                    String model = myScan.next();
                    if(type == 1) {
                        vehicles.add(new Bike(no, model));
                    }
                    else if(type == 2) {
                        vehicles.add(new Car(no, model));
                    }
                    else{
                        vehicles.add(new Truck(no, model));
                    }
                    System.out.println("Vehicle Added!");
                    break;

                // --- READ & RENT LOGIC ---
                case 2:
                    System.out.println("\n--- Available Vehicles ---");
                    for(int i = 0; i < vehicles.size(); i++) {
                        System.out.println((i+1) + ". " + vehicles.get(i).getDetails());
                    }
                    System.out.print("Select Vehicle No to Rent (0 to cancel): ");
                    int vIndex = myScan.nextInt() - 1;

                    if (vIndex >= 0 && vIndex < vehicles.size()) {
                        System.out.print("Enter No. of Days : ");
                        int days = myScan.nextInt();
                        double rent = vehicles.get(vIndex).calculateRent(days);
                        System.out.println("Total Bill : Rs." + rent);
                    }
                    break;

                // --- UPDATE ---
                case 3:
                    System.out.print("Enter Vehicle Number Plate to Update: ");
                    String updateId = myScan.next();
                    boolean foundUp = false;
                    for(Vehicle v : vehicles) {
                        if(v.getVehicleNumber().equalsIgnoreCase(updateId)) {
                            System.out.print("Enter New Model Name : ");
                            v.setModel(myScan.next()); // here Setter used to update
                            System.out.println("Vehicle Updated!!");
                            foundUp = true;
                            break;
                        }
                    }
                    if(!foundUp) {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                // --- DELETE ---
                case 4:
                    System.out.print("Enter Vehicle Number Plate to Delete: ");
                    String delId = myScan.next();
                    boolean foundDel = false;
                    Iterator<Vehicle> it = vehicles.iterator();
                    while(it.hasNext()) {
                        Vehicle v = it.next();
                        if(v.getVehicleNumber().equalsIgnoreCase(delId)) {
                            it.remove();
                            System.out.println("Vehicle Removed!!");
                            foundDel = true;
                            break;
                        }
                    }
                    if(!foundDel) System.out.println("Vehicle not found.");
                    break;

                case 5:
                    System.exit(0);

                default: System.out.println("Invalid Choice");
            }
        }
    }
}