
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        if(inputNum >= 6 && inputNum <= 9) {
            for(int i = 1; i <= 10; i++) {
                System.out.println(inputNum + " x " + i + " = " + (inputNum * i));
            }
        }
        else {
            System.out.println("You entered the number that is out of range");
        }
    }
}
