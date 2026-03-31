package Capgemini_Day10_Extras;

import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int terms = myScan.nextInt();
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");
        generateFibonacci(terms);
    }
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
