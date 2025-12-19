
import java.util.Scanner;

public class MultiplesOfNumbersUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number <= 100) {
            int i = number;
            while (i >= 1) {   // while loop instead of for
                if (number % i == 0) {
                    System.out.println(i + " is a multiple of " + number);
                }
                i--;
            }
        }
        else {
            System.out.println("Please enter a positive number between 1 and 100");
        }
    }
}
