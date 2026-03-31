package Capgemini_Day17_ScenarioBased;

import java.util.Scanner;

public class InvoiceGenerator {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the invoice details : ");
        String st = myScan.nextLine();
        String[] tasks = parseInvoice(st);
        System.out.println("The total amount is: " + getTotalAmount(tasks));
    }
    public static String[] parseInvoice(String str) {
        String[] items = str.split(", ");
        for (int i = 0; i < items.length; i++) {
            if (!items[i].contains("-") || !items[i].contains("INR")) {
                System.out.println("This is an Invalid invoice format : " + items[i]);
                return null;
            }
        }
        return items;
    }
    public static int getTotalAmount(String[] tasks) {
        if (tasks == null) {
            return 0;
        }
        int total = 0;
        for (int i = 0;i < tasks.length; i++) {
            String amount = tasks[i].split("-")[1].replace("INR", "").trim();
            int value = 0;
            for (int j = 0; j < amount.length(); j++) {
                value = value * 10 + (amount.charAt(j) - '0');
            }
            total += value;
        }
        return total;
    }
}
