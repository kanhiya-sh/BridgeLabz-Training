
import java.util.Scanner;

public class MultiplesOfNumbersUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0 && number <= 100) {
            for(int i = number; i >= 1; i--) {
                if(number % i == 0) {
                    System.out.println(i + " is a multiple of " + number);
                    continue;
                }
            }
        }
        else {
            System.out.println("Please enter a positive number between 1 and 100");
        }
    }
}
