package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(98.6, new TemperatureConverter().celsiusToFahrenheit(37), 0.1);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, new TemperatureConverter().fahrenheitToCelsius(32), 0.1);
    }
}
