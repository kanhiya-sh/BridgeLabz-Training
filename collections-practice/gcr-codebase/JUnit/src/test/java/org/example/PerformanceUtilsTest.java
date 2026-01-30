package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceUtilsTest {

    @Test
    @Timeout(2)
    void testLongRunningTaskTimeout() throws InterruptedException {
        PerformanceUtils utils = new PerformanceUtils();
        utils.longRunningTask();
    }
}
