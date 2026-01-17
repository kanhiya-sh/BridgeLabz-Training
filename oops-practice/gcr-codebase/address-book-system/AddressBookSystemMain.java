package BridgeLabz_Day26_AddressBookProblem;

import java.util.*;
public class AddressBookSystemMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program"); // starting
        Scanner myScan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
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
    }
}
