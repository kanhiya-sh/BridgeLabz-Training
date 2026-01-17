package BridgeLabz_Day26_AddressBookProblem;

import java.util.*;

public class AddressBookSystemMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner myScan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = myScan.nextInt();
            myScan.nextLine(); // buffer clear
            switch (choice) {
                case 1: // ADD CONTACT
                    System.out.print("Enter First Name : ");
                    String firstName = myScan.nextLine();

                    System.out.print("Enter Last Name : ");
                    String lastName = myScan.nextLine();

                    System.out.print("Enter Address : ");
                    String address = myScan.nextLine();

                    System.out.print("Enter City : ");
                    String city = myScan.nextLine();

                    System.out.print("Enter State : ");
                    String state = myScan.nextLine();

                    System.out.print("Enter Zip : ");
                    String zip = myScan.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String phoneNumber = myScan.nextLine();

                    System.out.print("Enter Email : ");
                    String email = myScan.nextLine();
                    Contact contact = new Contact(firstName, lastName, address, city, state, zip,
                            phoneNumber, email);
                    addressBook.addContact(contact);
                    break;
                case 2: // EDIT CONTACT
                    System.out.print("Enter First Name to Edit : ");
                    String editFirstName = myScan.nextLine();

                    System.out.print("Enter Last Name to Edit : ");
                    String editLastName = myScan.nextLine();

                    System.out.print("Enter New Address : ");
                    String newAddress = myScan.nextLine();

                    System.out.print("Enter New City : ");
                    String newCity = myScan.nextLine();

                    System.out.print("Enter New State : ");
                    String newState = myScan.nextLine();

                    System.out.print("Enter New Zip : ");
                    String newZip = myScan.nextLine();

                    System.out.print("Enter New Phone Number : ");
                    String newPhone = myScan.nextLine();

                    System.out.print("Enter New Email : ");
                    String newEmail = myScan.nextLine();
                    addressBook.editContact(editFirstName, editLastName, newAddress, newCity, newState,
                            newZip, newPhone, newEmail);
                    break;
                case 3: // DELETE CONTACT
                    System.out.print("Enter First Name to Delete : ");
                    String deleteFirstName = myScan.nextLine();

                    System.out.print("Enter Last Name to Delete : ");
                    String deleteLastName = myScan.nextLine();

                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                    break;

                case 4: // EXIT
                    System.out.println("Exiting Address Book Program");
                    break;

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }

        }
        while (choice != 4);
    }
}
