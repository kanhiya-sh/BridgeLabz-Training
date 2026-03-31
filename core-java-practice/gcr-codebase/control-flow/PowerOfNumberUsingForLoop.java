

import java.util.Scanner;

public class PowerOfNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        if (num >= 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * num;
            }
            System.out.println(num + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter positive integers for both number and power.");
        }
    }
}
