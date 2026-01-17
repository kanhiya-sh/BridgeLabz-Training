package BridgeLabz_Day26_AddressBookProblem;

import java.util.*;

public class AddressBook {
    private ArrayList<Contact> contactList = new ArrayList<>();
    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact Added Successfully !!");
    }
}
