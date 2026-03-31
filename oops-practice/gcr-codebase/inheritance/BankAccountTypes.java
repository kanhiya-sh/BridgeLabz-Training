package Capgemini_Day16_Inheritance;

class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountType() {
        System.out.println("Account Type: Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int tenureYears;
    FixedDepositAccount(int accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }
    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount acc2 = new CheckingAccount(102, 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount(103, 100000, 5);
        acc1.displayAccountType();
        acc2.displayAccountType();
        acc3.displayAccountType();
    }
}
