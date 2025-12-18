

import java.util.Scanner;

public class PerformOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        checking the condition for b = 0;
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return;
        }
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;
        System.out.println("The results of Int Operations are " + operation1 + " , " + operation2 + " , " + operation3 + " , and " + operation4);

    }
}
