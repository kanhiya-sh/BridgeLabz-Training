import java.util.Scanner;

public class PrintOddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        for(int i = 1; i <= inputNumber; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " is a even number");
            }
            else {
                System.out.println(i + " is a odd number");
            }
        }
    }
}
