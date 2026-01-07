package BridgeLabz_Day19_ScenarioBased_Bank;
// Inheritance
public class SavingsAccount extends Account implements BankService {
    public SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }
    public synchronized void deposit(double amount) {
        balance += amount;
    }
    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance in Savings Account");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}



