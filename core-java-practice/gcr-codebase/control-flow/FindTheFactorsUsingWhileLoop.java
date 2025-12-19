
import java.util.Scanner;

public class FindTheFactorsUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int i = 1; // this is the initialization
            while (i < number) { // here we are using while loop instead of for
                if (number % i == 0) {
                    System.out.println(i + " is a factor of " + number);
                }
                i++; // increment of  i
            }
        }
        else {
            System.out.println("Please enter a positive number");
        }
    }
}
