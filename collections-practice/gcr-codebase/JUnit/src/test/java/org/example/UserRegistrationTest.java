package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() ->
                new UserRegistration().registerUser("kanhiya",
                        "kanhiya@gmail.com", "pass123"));
    }

    @Test
    void testInvalidRegistration() {
        assertThrows(IllegalArgumentException.class, () ->
                new UserRegistration().registerUser("", "invalid", "123"));
    }

}
