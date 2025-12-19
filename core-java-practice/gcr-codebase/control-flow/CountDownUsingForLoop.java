
import java.util.Scanner;

public class CountDownUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
