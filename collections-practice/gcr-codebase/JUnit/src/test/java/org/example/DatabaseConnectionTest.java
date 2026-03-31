package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    @DisplayName("Database Connection Established Test")
    void testConnectionEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    @DisplayName("Database Connection Closed Test")
    void testConnectionClosed() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
