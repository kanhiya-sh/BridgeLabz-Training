package BridgeLabz_Day26_AddressBookProblem;

import java.util.*;
public class AddressBookSystemMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner myScan = new Scanner(System.in);
        Map<String, AddressBook> addressBookMap = new HashMap<>();
        AddressBook currentAddressBook = null;
        int choice;
        do {
            System.out.println("\n--- Address Book System Menu ---");
            System.out.println("1. Create Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Add Contact");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Search Person by City");
            System.out.println("7. Search Person by State");
            System.out.println("8. View Persons by City");
            System.out.println("9. View Persons by State");
            System.out.println("10. Exit");
            System.out.print("Enter your choice : ");
            choice = myScan.nextInt();
            myScan.nextLine();
            switch (choice) {
                case 1: // CREATE ADDRESS BOOK
                    System.out.print("Enter Address Book Name : ");
                    String bookName = myScan.nextLine();
                    if (addressBookMap.containsKey(bookName)) {
                        System.out.println("Address Book already exists");
                    }
                    else {
                        addressBookMap.put(bookName, new AddressBook());
                        System.out.println("Address Book created successfully");
                    }
                    break;

                case 2: // SELECT ADDRESS BOOK
                    System.out.print("Enter Address Book Name to Select : ");
                    String selectName = myScan.nextLine();

                    if (addressBookMap.containsKey(selectName)) {
                        currentAddressBook = addressBookMap.get(selectName);
                        System.out.println("Address Book selected");
                    }
                    else {
                        System.out.println("Address Book not found");
                    }
                    break;
                case 3: // ADD CONTACT
                    if (currentAddressBook == null) {
                        System.out.println("Please select an Address Book first");
                        break;
                    }
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
                    currentAddressBook.addContact(contact);
                    break;
                case 4:
                    if (currentAddressBook == null) {
                        System.out.println("Please select an Address Book first");
                        break;
                    }
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
                    currentAddressBook.editContact(editFirstName, editLastName, newAddress, newCity, newState,
                            newZip, newPhone, newEmail);
                    break;
                case 5:
                    if (currentAddressBook == null) {
                        System.out.println("Please select an Address Book first");
                        break;
                    }
                    System.out.print("Enter First Name to Delete : ");
                    String deleteFirstName = myScan.nextLine();
                    System.out.print("Enter Last Name to Delete : ");
                    String deleteLastName = myScan.nextLine();
                    currentAddressBook.deleteContact(deleteFirstName, deleteLastName);
                    break;
                case 6: // SEARCH BY CITY (UC-8)
                    System.out.print("Enter City to Search : ");
                    String searchCity = myScan.nextLine();
                    boolean cityFound = false;
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        List<Contact> list = entry.getValue().searchByCity(searchCity);
                        if (!list.isEmpty()) {
                            System.out.println("\nAddress Book : " + entry.getKey());
                            for (Contact c : list) {
                                System.out.println(c.getFirstName() + " " + c.getLastName());
                            }
                            cityFound = true;
                        }
                    }
                    if (!cityFound) {
                        System.out.println("No person found in given city");
                    }
                    break;
                case 7:
                    System.out.print("Enter State to Search : ");
                    String searchState = myScan.nextLine();
                    boolean stateFound = false;
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        List<Contact> list = entry.getValue().searchByState(searchState);
                        if (!list.isEmpty()) {
                            System.out.println("\nAddress Book : " + entry.getKey());
                            for (Contact c : list) {
                                System.out.println(c.getFirstName() + " " + c.getLastName());
                            }
                            stateFound = true;
                        }
                    }
                    if (!stateFound) {
                        System.out.println("No person found in given state");
                    }
                    break;
                case 8:
                    Map<String, List<String>> cityPersonMap = new HashMap<>();
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        for (Contact c : entry.getValue().searchByCity("")) {
                            cityPersonMap
                                    .computeIfAbsent(c.getCity(), k -> new ArrayList<>())
                                    .add(c.getFirstName() + " " + c.getLastName());
                        }
                    }
                    if (cityPersonMap.isEmpty()) {
                        System.out.println("No contacts available");
                    }
                    else {
                        for (Map.Entry<String, List<String>> e : cityPersonMap.entrySet()) {
                            System.out.println("\nCity : " + e.getKey());
                            for (String name : e.getValue()) {
                                System.out.println(name);
                            }
                        }
                    }
                    break;
                case 9:
                    Map<String, List<String>> statePersonMap = new HashMap<>();
                    for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
                        for (Contact c : entry.getValue().searchByState("")) {
                            statePersonMap
                                    .computeIfAbsent(c.getState(), k -> new ArrayList<>())
                                    .add(c.getFirstName() + " " + c.getLastName());
                        }
                    }
                    if (statePersonMap.isEmpty()) {
                        System.out.println("No contacts available");
                    }
                    else {
                        for (Map.Entry<String, List<String>> e : statePersonMap.entrySet()) {
                            System.out.println("\nState : " + e.getKey());
                            for (String name : e.getValue()) {
                                System.out.println(name);
                            }
                        }
                    }
                    break;
                case 10:
                    System.out.println("Exiting Address Book System");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
        while (choice != 8);
    }
}
