package BridgeLabz_Day22_ScenarioBased_OOPS.HospitalPatientManagementSystem;
import java.util.*;

public class HospitalManagementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>(); // List to store data
        while (true) {
            System.out.println("\n--- Hospital CRUD System ---");
            System.out.println("1. Add Patient"); // Create
            System.out.println("2. View All Patients"); // Read
            System.out.println("3. Update Patient Details"); // Update
            System.out.println("4. Discharge/Delete Patient"); // Delete
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                // --- CREATE ---
                case 1:
                    System.out.println("1. InPatient (Admit), 2. OutPatient (Visit)");
                    int type = sc.nextInt();
                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Daily Rate : ");
                        double rate = sc.nextDouble();
                        System.out.print("Days Admitted : ");
                        int days = sc.nextInt();
                        patients.add(new InPatient(id, name, age, rate, days));
                    }
                    else {
                        System.out.print("Consultation Fee : ");
                        double fee = sc.nextDouble();
                        patients.add(new OutPatient(id, name, age, fee));
                    }
                    System.out.println("Patient Added Successfully!!");
                    break;

                // --- READ ---
                case 2:
                    System.out.println("\n--- List of Patients ---");
                    if (patients.isEmpty()) {
                        System.out.println("No record found");
                    }
                    else {
                        for (Patient p : patients) {
                            p.displayInfo();
                        }
                    }
                    break;

                // --- UPDATE ---
                case 3:
                    System.out.print("Enter Patient ID to Update: ");
                    int updateId = sc.nextInt();
                    boolean foundToUpdate = false;

                    for (Patient p : patients) {
                        if (p.getId() == updateId) {
                            System.out.print("Enter New Name: ");
                            p.setName(sc.next()); // Using Setter here
                            System.out.print("Enter New Age: ");
                            p.setAge(sc.nextInt());
                            System.out.println("Record Updated!");
                            foundToUpdate = true;
                            break;
                        }
                    }
                    if (!foundToUpdate) {
                        System.out.println("Patient ID not found.");
                    }
                    break;

                // --- DELETE ---
                case 4:
                    System.out.print("Enter Patient ID to Delete: ");
                    int deleteId = sc.nextInt();
                    boolean foundToDelete = false;
                //  here we are using iterator to safely delete the patient data
                    Iterator<Patient> iterator = patients.iterator();
                    while (iterator.hasNext()) {
                        Patient p = iterator.next();
                        if (p.getId() == deleteId) {
                            iterator.remove();
                            System.out.println("Patient Discharged (Deleted)!");
                            foundToDelete = true;
                            break;
                        }
                    }
                    if (!foundToDelete) System.out.println("Patient ID not found.");
                    break;

                case 5:
                    System.out.println("Exiting System.....");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }
}