
import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double remainder = num1 % num2 ;
        double quotient = num1 / num2 ;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + num1 + " and " + num2);
    }
}
