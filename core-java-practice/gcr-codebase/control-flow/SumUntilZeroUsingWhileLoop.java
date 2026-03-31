
import java.util.Scanner;

public class SumUntilZeroUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSum = 0;
        while (true) {
            double inputNumber = sc.nextDouble();
            if (inputNumber <= 0) {
                break;
            }
            totalSum += inputNumber;
        }
        System.out.println("The total sum is " + totalSum);
    }
}
