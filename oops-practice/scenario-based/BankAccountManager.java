package Capgemini_Day16_ScenarioBased;

class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn is : " + amount);
        }
        else {
            System.out.println("Invalid withdraw amount");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance is : " + balance);
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC123", 5000);
        acc.deposit(2000);
        acc.checkBalance();
        acc.withdraw(1000);
        acc.withdraw(7000); // this is for showing invalid withdraw
        acc.checkBalance();
    }
}
