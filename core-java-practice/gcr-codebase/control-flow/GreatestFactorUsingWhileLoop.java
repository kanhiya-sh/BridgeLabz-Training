
import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int greatestFactor = 1;

        if (inputNumber > 0) {
            int i = inputNumber - 1; // initialization

            while (i >= 1) {   // while loop instead of for
                if (inputNumber % i == 0) {
                    greatestFactor = i;
                    break;  // exit from the loop once the greatest factor is found
                }
                i--;  // decrement
            }

            System.out.println("Greatest factor of " + inputNumber + " is: " + greatestFactor);
        }
        else {
            System.out.println("Please enter a positive number");
        }
    }
}
