package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("25-12-2024", new DateFormatter().formatDate("2024-12-25"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(Exception.class, () -> new DateFormatter().formatDate("25-12-2024"));
    }
}
