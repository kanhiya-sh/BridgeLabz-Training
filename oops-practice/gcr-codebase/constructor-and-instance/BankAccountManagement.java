package constructorAndInstance;

class BankAccount {

	public String accountNumber;      
	protected String accountHolder;   
	private double balance;           

	// setter
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// getter
	public double getBalance() {
		return balance;
	}
}

//this is the subclass 
class SavingsAccount extends BankAccount {

	void displayAccountDetails() {
		System.out.println("Account No: " + accountNumber);
		System.out.println("Account Holder: " + accountHolder);
	}
}

//driver class
public class BankAccountManagement {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.accountNumber = "ACC1001";
		sa.accountHolder = "Kanhiya";
		sa.setBalance(50000);
		sa.displayAccountDetails();
		System.out.println("Balance: " + sa.getBalance());
	}
}

