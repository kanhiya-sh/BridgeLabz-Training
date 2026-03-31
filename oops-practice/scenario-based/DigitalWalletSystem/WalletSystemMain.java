package BridgeLabz_Day22_ScenarioBased_OOPS.DigitalWalletSystem;


import java.util.*;

public class WalletSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User 1 Name: ");
        User u1 = new User(sc.nextLine());
        System.out.print("Enter User 2 Name: ");
        User u2 = new User(sc.nextLine());
        TransferService walletTransfer = new WalletTransfer();
        TransferService bankTransfer = new BankTransfer();
        while (true) {
            System.out.println("\n===== DIGITAL WALLET MENU =====");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Wallet Transfer");
            System.out.println("4. Bank Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter amount to add: ");
                        u1.wallet.addMoney(sc.nextDouble());
                        System.out.println("Money Added Successfully");
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        u1.wallet.withdrawMoney(sc.nextDouble());
                        System.out.println("Money Withdrawn Successfully");
                        break;

                    case 3:
                        System.out.print("Enter amount to transfer (Wallet): ");
                        walletTransfer.transfer(u1, u2, sc.nextDouble());
                        break;

                    case 4:
                        System.out.print("Enter amount to transfer (Bank): ");
                        bankTransfer.transfer(u1, u2, sc.nextDouble());
                        break;

                    case 5:
                        System.out.println("Your Balance: " + u1.wallet.getBalance());
                        break;

                    case 6:
                        System.out.println("Transaction History:");
                        u1.wallet.showTransactions();
                        break;

                    case 7:
                        System.out.println("Thank You!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
