

import java.util.Scanner;

public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        if (number == 0) {
            System.out.println("Digit 0 : 1 times");
            return;
        }

        long temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        long[] digitsArray = new long[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digitsArray[index] = temp % 10;
            temp /= 10;
            index++;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            int digit = (int) digitsArray[i];
            frequency[digit]++;
        }

        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " : " + frequency[i] + " times");
            }
        }
    }
}
