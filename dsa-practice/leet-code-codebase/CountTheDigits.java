package BridgeLabz_Day24_Leetcode;

import java.util.Scanner;
public class CountTheDigits {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = myScan.nextInt();
        System.out.println("Digits the number that divide the number are : " + countDigits(num));
    }
    public static int countDigits(int num) {
        int counter = 0;
        int n = num;
        while(n > 0){
            int rem = n % 10;
            if(num % rem == 0){
                counter++;
            }
            n /= 10;
        }
        return counter;
    }
}
