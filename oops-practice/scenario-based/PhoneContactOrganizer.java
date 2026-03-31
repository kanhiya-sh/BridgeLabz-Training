package BridgeLabz_Day18_ScenarioBased;
import java.util.*;

public class PhoneContactOrganizer {
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> phones = new ArrayList<>();
    public static void main(String[] args) {
        try {
            addContact("Bhavy", "0123456789");
            addContact("Naman", "1234567890");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        searchContact("0123456789");
        deleteContact("0123456789");
    }
    public static void addContact(String name, String phone) throws Exception {
        if (!phone.matches("\\d{10}")) // confirming phone number is of 10 digits
            throw new Exception("Invalid Phone Number");
        if (phones.contains(phone)) {
            System.out.println("Duplicate contact not allowed");
            return;
        }
        names.add(name);
        phones.add(phone);
        System.out.println("Contact added");
    }
    public static void searchContact(String phone) {
        int index = phones.indexOf(phone);
        if (index != -1)
            System.out.println("Name: " + names.get(index));
        else
            System.out.println("Contact not found");
    }
    public static void deleteContact(String phone) {
        int index = phones.indexOf(phone);
        if (index != -1) {
            names.remove(index);
            phones.remove(index);
            System.out.println("Contact deleted Successfully !!");
        }
        else {
            System.out.println("Contact not found");
        }
    }
}
