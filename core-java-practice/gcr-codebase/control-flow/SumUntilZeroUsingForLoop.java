
import java.util.Scanner;

public class SumUntilZeroUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value = sc.nextDouble(); // asking user to input a value .
        while (value != 0) {
            total += value; // adding the input value to total if value is not equals to 0 .
            value = sc.nextDouble(); // asking user to input again the next value .
        }
        System.out.println("The total sum is " + total); // printing the total sum .
    }
}
