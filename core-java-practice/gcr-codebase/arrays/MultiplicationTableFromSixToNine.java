
import java.util.Scanner;

public class MultiplicationTableFromSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate its multiplication table:");
        int number = sc.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Invalid input! Please enter a number between 6 and 9 only.");
            return;
        }

        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
            System.out.println(number + " x " + (i + 1) + " = " + table[i]);
        }
    }
}
