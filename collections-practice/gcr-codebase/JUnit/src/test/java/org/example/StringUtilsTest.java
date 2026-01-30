package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setup() {
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("Reverse String Test")
    void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("Palindrome True Test")
    void testIsPalindromeTrue() {
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    @DisplayName("Palindrome False Test")
    void testIsPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    @DisplayName("Uppercase Conversion Test")
    void testToUpperCase() {
        assertEquals("JAVA", stringUtils.toUpperCase("java"));
    }
}
