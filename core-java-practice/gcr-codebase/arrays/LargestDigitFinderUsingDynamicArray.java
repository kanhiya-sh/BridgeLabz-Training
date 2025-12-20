

import java.util.Scanner;

public class LargestDigitFinderUsingDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {

            // 🔹 resize array if index reaches maxDigit
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // copy old digits into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // reassign reference
            }

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }
}
