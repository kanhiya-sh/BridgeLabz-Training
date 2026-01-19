package BridgeLabz_Day26_AddressBookProblem;

import java.util.*;
public class AddressBook {
    private HashSet<Contact> contactSet = new HashSet<>();
    public void addContact(Contact contact) {
        if (contactSet.add(contact)) {
            System.out.println("Contact added successfully");
        }
        else {
            System.out.println("Duplicate contact not allowed");
        }
    }
    public void editContact(String firstName, String lastName,
                            String address, String city, String state,
                            String zip, String phoneNumber, String email) {

        for (Contact contact : contactSet) {
            if (contact.getFirstName().equals(firstName)
                    && contact.getLastName().equals(lastName)) {

                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);

                System.out.println("Contact updated successfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    public void deleteContact(String firstName, String lastName) {
        Iterator<Contact> iterator = contactSet.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equals(firstName)
                    && contact.getLastName().equals(lastName)) {

                iterator.remove();
                System.out.println("Contact deleted successfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    public List<Contact> searchByCity(String city) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contactSet) {
            if (contact.getCity().equalsIgnoreCase(city)) {
                result.add(contact);
            }
        }
        return result;
    }
    public List<Contact> searchByState(String state) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contactSet) {
            if (contact.getState().equalsIgnoreCase(state)) {
                result.add(contact);
            }
        }
        return result;
    }
}
