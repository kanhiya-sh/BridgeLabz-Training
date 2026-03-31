package BridgeLabz_Day28_ScenarioBased.BrowserBuddy;

import java.util.Scanner;
import java.util.Stack;

public class BrowserBuddyMain {
    static BrowserTab currentTab = new BrowserTab();
    static Stack<BrowserTab> closedTabs = new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Visit Page");
            System.out.println("2.Back");
            System.out.println("3.Forward");
            System.out.println("4.Close Tab");
            System.out.println("5.Restore Tab");
            System.out.println("6.Current Page");
            System.out.println("0.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    currentTab.visit(url);
                    break;

                case 2:
                    currentTab.back();
                    break;

                case 3:
                    currentTab.forward();
                    break;

                case 4:
                    closedTabs.push(currentTab);
                    currentTab = new BrowserTab();
                    System.out.println("Tab Closed");
                    break;

                case 5:
                    if (!closedTabs.isEmpty()) {
                        currentTab = closedTabs.pop();
                        System.out.println("Tab Restored");
                    } else {
                        System.out.println("No Closed Tabs");
                    }
                    break;

                case 6:
                    System.out.println("Current Page: " + currentTab.getCurrentPage());
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (choice != 0);
    }
}
