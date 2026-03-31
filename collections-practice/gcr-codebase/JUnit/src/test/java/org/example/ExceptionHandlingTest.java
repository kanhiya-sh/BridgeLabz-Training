package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {

    @Test
    @DisplayName("Division by Zero Exception Test")
    void testDivideByZero() {
        ExceptionHandling mathUtils = new ExceptionHandling();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }
}
