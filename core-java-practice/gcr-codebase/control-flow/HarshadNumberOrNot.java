

import java.util.Scanner;

public class HarshadNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumOfDigits = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
