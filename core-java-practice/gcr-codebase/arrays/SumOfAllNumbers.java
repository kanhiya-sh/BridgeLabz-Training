

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double totalSum = 0.0;
        int idx = 0;

        while (true) {

//            checking that is arrya is full or not
            if (idx >= 10) {
                break;
            }

            System.out.println("Enter a number (0 or negative to stop) ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }

            arr[idx] = input;
            idx++;
        }

        for (int i = 0; i < idx; i++) {
            totalSum += arr[i];
        }

        System.out.println("The sum of all numbers is: " + totalSum);
    }
}
