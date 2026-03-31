import java.util.Scanner;

public class PowerOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        if (num >= 0 && power >= 0) {
            int result = 1;
            int i = 1;
            while (i <= power) {  // using while loop instead of for loop
                result = result * num;
                i++;  // increment
            }
            System.out.println(num + " raised to the power " + power + " is: " + result);
        }
        else {
            System.out.println("Please enter positive integers for both number and power.");
        }
    }
}
