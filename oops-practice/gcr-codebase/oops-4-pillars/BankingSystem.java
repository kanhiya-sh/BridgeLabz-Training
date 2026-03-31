package BridgeLabz_Day17_4Pillars;

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    double calculateInterest() {
        return getBalance() * 0.04;
    }
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    double calculateInterest() {
        return getBalance() * 0.02;
    }
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("Acc101", "Bhavy", 70000);
        BankAccount a2 = new CurrentAccount("Acc102", "Naman", 80000);
        BankAccount[] accounts = { a1, a2 };
        for (BankAccount acc : accounts) {
            System.out.println("Account Number : " + acc.getAccountNumber());
            System.out.println("Holder Name : " + acc.getHolderName());
            System.out.println("Balance : " + acc.getBalance());
            System.out.println("Interest : " + acc.calculateInterest());
            System.out.println("**************************");
        }
    }
}
