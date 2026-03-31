
import java.util.Scanner;

public class GreatestFactorUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int greatestFactor = 1;
        if(inputNumber > 0) {
            for(int i = inputNumber - 1 ; i >= 1; i--) {
                if(inputNumber % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest factor of " + inputNumber + " is: " + greatestFactor);
        }
        else {
            System.out.println("Please enter a positive number");
        }
    }
}
