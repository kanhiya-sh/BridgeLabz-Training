

import java.util.Scanner;

public class TheCoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String selectedCoffee;
        int cups;
        double totalBill = 0.0;

        while (true) {
            System.out.println("Enter coffee type (Espresso/Latte/Cappuccino) or 'exit' to finish:");
            selectedCoffee = sc.next().toLowerCase();

            if (selectedCoffee.equals("exit")) {
                break;
            }

            System.out.println("Enter quantity:");
            cups = sc.nextInt();

            double coffeePrice = 0.0;

            switch (selectedCoffee) {
                case "espresso":
                    coffeePrice = 150;
                    break;

                case "latte":
                    coffeePrice = 200;
                    break;

                case "cappuccino":
                    coffeePrice = 250;
                    break;

                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            totalBill = totalBill + (coffeePrice * cups);
        }

        System.out.println("Total bill before GST: " + totalBill);

        double gstAmount = totalBill * 0.18;
        System.out.println("GST (18%): " + gstAmount);

        double finalAmount = totalBill + gstAmount;
        System.out.println("Total amount to be paid: " + finalAmount);
    }
}