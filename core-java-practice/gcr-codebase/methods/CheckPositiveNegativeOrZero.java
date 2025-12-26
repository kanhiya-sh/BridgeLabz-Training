package Capgemini_Day8_Methods_Level1;

import java.util.Scanner;

public class CheckPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int number = myScan.nextInt();
        CheckPositiveNegativeOrZero check = new CheckPositiveNegativeOrZero();
        int checkPNZ = check.CheckTheNumber(number);
        System.out.println(checkPNZ);
    }
    public int CheckTheNumber(int number) {
        if(number < 0) {
            return -1;
        }
        else if (number > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
