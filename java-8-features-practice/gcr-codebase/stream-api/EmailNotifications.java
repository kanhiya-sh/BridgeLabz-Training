package BridgeLabz_Day39_StreamApi;

import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emailsList = List.of("admin@gmail.com", "user@gmail.com");
        emailsList.forEach(email -> sendEmailNotification(email));
    }
    public static void sendEmailNotification(String email) {
        System.out.println("Sent " + email);
    }
}