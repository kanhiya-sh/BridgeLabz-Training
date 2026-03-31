
import java.util.Scanner;

public class SumOfNaturalNumbersUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 0) {
            int sumLoop = 0;
            int i = 1;
            while ( i <= number ) {
                sumLoop += i;
                i++;
            }
            System.out.println("The sum of " + number + " natural numbers using loop is " + sumLoop);
            int sumFormulae = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers using formulae is " + sumFormulae);
        }
    }
}
