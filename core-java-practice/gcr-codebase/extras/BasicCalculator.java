package Capgemini_Day10_Extras;

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
//        entering two numbers
        System.out.println("Enter first number : ");
        double num1 = myScan.nextDouble();
        System.out.println("Enter second number : ");
        double num2 = myScan.nextDouble();
//        choosing operation
        System.out.println("Choose operation : ");
        char operation = myScan.next().charAt(0);
        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        }
        else if (operation == '-') {
            result = num1 - num2;
        }
        else if (operation == '*') {
            result = num1 * num2;
        }
        else if (operation == '/') {
            result = num1 / num2;
        }
        else {
            System.out.println("Invalid operation!");
            return;
        }
        System.out.println("The result is: " + result);
    }
}
