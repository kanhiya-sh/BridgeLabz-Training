package BridgeLabz_Day19_ScenarioBased_Bank;

// Inheritance
public class CurrentAccount extends Account implements BankService {
    public CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }
    public synchronized void deposit(double amount) {
        balance += amount;
    }
    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance in Current Account");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}
