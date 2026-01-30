package org.example;

public class UserRegistration {

    public void registerUser(String username, String email, String password) {
        if (username.isEmpty() || !email.contains("@") || password.length() < 6) {
            throw new IllegalArgumentException("Invalid input");
        }
    }

}
