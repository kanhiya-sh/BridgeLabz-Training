package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(new PasswordValidator().isValid("Java1234"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(new PasswordValidator().isValid("java123"));
    }
}
