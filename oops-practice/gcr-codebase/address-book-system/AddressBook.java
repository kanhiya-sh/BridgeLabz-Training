package BridgeLabz_Day26_AddressBookProblem;

import java.util.*;

public class AddressBook {
    private ArrayList<Contact> contactList = new ArrayList<>();
    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact Added Successfully !!");
    }
//    to update the details using name
    public void editContact(String firstName, String lastName, String address, String city,
                            String state, String zip, String phoneNumber, String email) {
        for(Contact contact : contactList) {
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                System.out.println("Contact updated successfully !!");
                return;
            }
        }
    }
}
