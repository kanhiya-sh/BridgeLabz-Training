package Capgemini_Day8_Methods_Level1;

import java.util.Scanner;
public class PrintQuotientAndRemainder {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Your Two Numbers: ");
        int dividend = myScan.nextInt(); // this will be the number 1
        int divisor = myScan.nextInt(); // this will be the number 2
        PrintQuotientAndRemainder pr = new PrintQuotientAndRemainder();
        int[] result = pr.calculateQuotientAndRemainder(dividend, divisor);
        System.out.println("Quotient: " + result[0]); // index 0 for quotient
        System.out.println("Remainder: " + result[1]); // index 1 for remainder
    }
    public int[] calculateQuotientAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient, remainder};
    }
}
