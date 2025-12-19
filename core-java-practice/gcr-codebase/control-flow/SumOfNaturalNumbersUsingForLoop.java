
import java.util.Scanner;

public class SumOfNaturalNumbersUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0) { // natural numbers are positive integers starting from 1
            int sumLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }
            System.out.println("The sum of " + number + " natural numbers using loop is " + sumLoop);
//            Now using formulae
            int sumFormulae = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers using formulae is " + sumFormulae);
        }
    }
}
