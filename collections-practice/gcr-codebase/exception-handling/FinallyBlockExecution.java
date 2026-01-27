package BridgeLabz_Day32_ExceptionHandling;

import java.util.*;
public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        try {
            int a = myScan.nextInt();
            int b = myScan.nextInt();
            System.out.println("Result : " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
