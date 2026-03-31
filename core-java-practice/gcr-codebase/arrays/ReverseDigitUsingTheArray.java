

import java.util.Scanner;

public class ReverseDigitUsingTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int temp = inputNumber;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int[] reverseArray = new int[count];
        for (int i = 0; i < count; i++) {
            reverseArray[i] = inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        System.out.println("Reversed Number:");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseArray[i]);
        }
    }
}
