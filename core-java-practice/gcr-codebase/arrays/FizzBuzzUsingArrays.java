

import java.util.Scanner;
public class FizzBuzzUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        if (inputNumber > 0) {

            String[] result = new String[inputNumber + 1];

            // store results in array
            for (int i = 1; i <= inputNumber; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    result[i] = "FizzBuzz";
                }
                else if (i % 3 == 0) {
                    result[i] = "Fizz";
                }
                else if (i % 5 == 0) {
                    result[i] = "Buzz";
                }
                else {
                    result[i] = String.valueOf(i);
                }
            }

            // print array results
            for (int i = 1; i <= inputNumber; i++) {
                System.out.println("Position " + i + " = " + result[i]);
            }
        }
        else {
            System.out.println("Please enter a positive number");
        }
    }
}
