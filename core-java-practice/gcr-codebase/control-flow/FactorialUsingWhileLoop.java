
import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        if(number >= 0) {
            int i = 1;
            while(i <= number) {
                factorial *=  i;
                i++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        else {
            System.out.println("Please enter a non-negative number");
        }
    }
}
