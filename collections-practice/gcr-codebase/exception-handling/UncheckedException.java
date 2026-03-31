package BridgeLabz_Day32_ExceptionHandling;

import java.util.*;
public class UncheckedException {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        try {
            int a = myScan.nextInt();
            int b = myScan.nextInt();
            System.out.println("Result: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers");
        }
    }
}
