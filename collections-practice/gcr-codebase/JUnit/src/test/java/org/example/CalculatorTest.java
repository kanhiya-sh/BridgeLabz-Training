package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest  {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition Test")
    public void testAdd() {
        assertEquals(10, calculator.add(6, 4));
    }

    @Test
    @DisplayName("Subtraction Test")
    public void testSubtract() {
        assertEquals(2, calculator.subtract(6, 4));
    }

    @Test
    @DisplayName("Multiplication Test")
    public void testMultiply() {
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    @DisplayName("Divide Test")
    public void testDivide() {
        assertEquals(2, calculator.divide(8, 4));
    }

    @Test
    @DisplayName("Division by Zero Exception Test")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}