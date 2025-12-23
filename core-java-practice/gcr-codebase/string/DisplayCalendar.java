

import java.util.Scanner;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = myScan.nextInt();
        System.out.print("Enter year: ");
        int year = myScan.nextInt();
        displayCalendar(month, year);
    }
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
    // checking if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    // checking for number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }
    // Method to get first day of month as if it lies on which day (this is Gregorian algorithm)
    public static int getFirstDay(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0; // here it represents like - 0 = Sunday, 1 = Monday ...
    }
    // Method to display calendarr
    public static void displayCalendar(int month, int year) {
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(1, month, year);
        int daysInMonth = getDaysInMonth(month, year);
//         this is just for the correct alignment of first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        // Second loop to print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
