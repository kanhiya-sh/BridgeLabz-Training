

import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number <= 0) {
            System.out.println("Error: Input an Natural Number");
            return;
        }
        int [] even = new int[number / 2 + 1];
        int [] odd = new int[number / 2 + 1];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 0) {
                even[evenCount] = i;
                evenCount++;
            }
            else {
                odd[oddCount] = i;
                oddCount++;
            }
        }

        System.out.println("Array of Even Numbers");

        for (int i = 0; i < evenCount; i++) {
            System.out.println(even[i] + " ");
        }
//        odd numbers array.
        System.out.println("Array of Odd Numbers");

        for (int i = 0; i < oddCount; i++) {
            System.out.println(odd[i] + " ");
        }
    }
}
