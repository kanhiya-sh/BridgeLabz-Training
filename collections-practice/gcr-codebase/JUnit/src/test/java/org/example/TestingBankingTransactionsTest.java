package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        assertEquals(1000, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(400);
        assertEquals(600, acc.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount acc = new BankAccount();
        acc.deposit(300);
        assertThrows(IllegalStateException.class, () -> acc.withdraw(500));
    }
}
