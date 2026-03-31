package BridgeLabz_Day19_ScenarioBased_Bank;

import java.util.*;

public class OnlineBanking {
    static List<String> transactionHistory = new ArrayList<>();
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        // Account creation
        System.out.print("Enter Account Number : ");
        int accNo = myScan.nextInt();
        System.out.print("Enter Initial Balance : ");
        double bal = myScan.nextDouble();
        System.out.print("Enter Account Type (1-Savings, 2-Current) : ");
        int type = myScan.nextInt();

        BankService account = (type == 1) ? new SavingsAccount(accNo, bal) : new CurrentAccount(accNo, bal);

        while (true) {
            System.out.println("\n--- ONLINE BANKING SYSTEM ---");
            System.out.println("Type 1 to Deposit");
            System.out.println("Type 2 to Withdraw");
            System.out.println("Type 3 to Check Balance");
            System.out.println("Type 4 to Transfer Funds");
            System.out.println("Type 5 to Check Transaction History");
            System.out.println("Type 6 to Exit");
            System.out.print("Enter Your choice : ");
            int choice = myScan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount : ");
                    double dep = myScan.nextDouble();
                    Thread t1 = new Thread(() -> {
                        account.deposit(dep);
                        transactionHistory.add("Deposited : " + dep);
                    });
                    t1.start();
                    joinThread(t1);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount : ");
                    double wd = myScan.nextDouble();
                    Thread t2 = new Thread(() -> {
                        try {
                            account.withdraw(wd);
                            transactionHistory.add("Withdrawn : " + wd);
                        }
                        catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    });
                    t2.start();
                    joinThread(t2);
                    break;

                case 3:
                    System.out.println("Total Balance : " + account.getBalance());
                    break;

                case 4: // Fund Transfer
                    System.out.print("Enter transfer amount : ");
                    double amt = myScan.nextDouble();
                    Thread t3 = new Thread(() -> {
                        try {
                            account.withdraw(amt);
                            transactionHistory.add("Transferred: " + amt);
                        }
                        catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    });
                    t3.start();
                    joinThread(t3);
                    break;

                case 5:
                    for (String t : transactionHistory) {
                        System.out.println(t);
                    }
                    break;

                case 6:
                    System.out.println("Banking Session Ended");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    public static void joinThread(Thread t) {
        try {
            t.join();
        }
        catch (Exception e) {}
    }
}


