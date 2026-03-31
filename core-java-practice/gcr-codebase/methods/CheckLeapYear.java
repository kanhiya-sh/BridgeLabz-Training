package Capgemini_Day8_Methods_Level2;

import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the year:");
        int inputYear = myScan.nextInt();
        CheckLeapYear checker = new CheckLeapYear();
        boolean isLeap = checker.isLeapYear(inputYear);
        if (isLeap) {
            System.out.println(inputYear + " is a leap year");
        }
        else {
            System.out.println(inputYear + " is not a leap year");
        }
    }
    public boolean isLeapYear(int year) {
        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
