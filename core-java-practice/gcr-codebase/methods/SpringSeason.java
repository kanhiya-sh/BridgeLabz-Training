package Capgemini_Day8_Methods_Level1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the Date and Month: ");
        int date = myScan.nextInt();
        int month = myScan.nextInt();
        SpringSeason ss = new SpringSeason();
        String checkSeason = ss.CheckSpringSeason(date, month);
        System.out.println(checkSeason);
    }
    public String CheckSpringSeason(int date, int month) {
        if ((month == 3 && date >= 20 && date <= 31) || (month == 4 && date >= 1 && date <= 30) || (month == 5 && date >= 1 && date <= 31) || (month == 6 && date >= 1 && date <= 20)) {
            return "Its a Spring Season";
        }
        else {
            return "Not a Spring Season";
        }
    }
}
