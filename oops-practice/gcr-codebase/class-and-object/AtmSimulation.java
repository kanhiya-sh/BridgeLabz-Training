package Capgemini_Day12_class_object;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String holder, int accNo, double balance) {
        this.accountHolder = holder;
        this.accountNumber = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class AtmSimulation {
    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount("User", 101, 700);
        bankAcc.showBalance();
        bankAcc.deposit(200);
        bankAcc.showBalance();
        bankAcc.withdraw(100);
        bankAcc.showBalance();
        bankAcc.withdraw(1000);
    }
}
