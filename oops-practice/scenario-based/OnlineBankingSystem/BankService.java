package BridgeLabz_Day19_ScenarioBased_Bank;
// Abstraction
public interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double getBalance();
}

