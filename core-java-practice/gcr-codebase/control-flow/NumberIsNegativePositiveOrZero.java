
import java.util.Scanner;

public class NumberIsNegativePositiveOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("zero");
        }
        else if (number < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("Positive");
        }
    }
}
