

import java.util.Scanner;

public class CheckPositiveNegativeOrZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input and checking each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing first and last elements AFTER input is complete
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first < last) {
            System.out.println("The first number " + first + " is less than the last number " + last + ".");
        } else if (first > last) {
            System.out.println("The first number " + first + " is greater than the last number " + last + ".");
        } else {
            System.out.println("The first number " + first + " is equal to the last number " + last + ".");
        }
    }
}
