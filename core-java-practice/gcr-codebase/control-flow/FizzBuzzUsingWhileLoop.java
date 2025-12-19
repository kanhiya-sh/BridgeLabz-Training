
import java.util.Scanner;

public class FizzBuzzUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        if (inputNumber > 0) {
            int i = 1;
            while (i <= inputNumber) { // while loop instead of for
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " is a FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println(i + " is a Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println(i + " is a Buzz");
                }
                else {
                    System.out.println(i + " is Not a FizzBuzz");
                }
                i++; // increment of i
            }
        }
        else {
            System.out.println("Please enter a positive number");
        }

    }
}
