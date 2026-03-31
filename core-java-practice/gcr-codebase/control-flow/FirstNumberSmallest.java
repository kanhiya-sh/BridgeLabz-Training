
import java.util.Scanner;

public class FirstNumberSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        boolean isSmallest = firstNumber < secondNumber && firstNumber < thirdNumber;
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
