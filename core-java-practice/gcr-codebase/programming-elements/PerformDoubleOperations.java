

import java.util.Scanner;

public class PerformDoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
//        checking the condition for b = 0;
        if (b == 0.0) {
            System.out.println("Division by zero is not allowed");
            return;
        }
        double operation1 = a + b * c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;
        System.out.println("The results of double Operations are " + operation1 + " , " + operation2 + " , " + operation3 + " , and " + operation4);

    }
}