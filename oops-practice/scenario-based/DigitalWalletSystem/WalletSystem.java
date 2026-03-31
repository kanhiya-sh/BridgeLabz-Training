package BridgeLabz_Day22_ScenarioBased_OOPS.DigitalWalletSystem;

import java.util.*;
// Custom Exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// Transaction class
class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return type + " : " + amount;
    }
}

// Wallet class
class Wallet {
    double balance;
    ArrayList<Transaction> history = new ArrayList<>();

    void addMoney(double amount) {
        balance += amount;
        history.add(new Transaction("ADD", amount));
    }

    void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        history.add(new Transaction("WITHDRAW", amount));
    }

    double getBalance() {
        return balance;
    }

    void showTransactions() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}

// User class
class User {
    String name;
    Wallet wallet;

    User(String name) {
        this.name = name;
        this.wallet = new Wallet();
    }
}

// Interface
interface TransferService {
    void transfer(User from, User to, double amount) throws InsufficientBalanceException;
}

// Wallet Transfer (Polymorphism)
class WalletTransfer implements TransferService {
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.wallet.withdrawMoney(amount);
        to.wallet.addMoney(amount);
        System.out.println("Wallet Transfer Successful");
    }
}

// Bank Transfer (Polymorphism)
class BankTransfer implements TransferService {
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.wallet.withdrawMoney(amount);
        to.wallet.addMoney(amount);
        System.out.println("Bank Transfer Successful");
    }
}