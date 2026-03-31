

import java.util.Scanner;

public class MaxNumberOfHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int maxNumberOfHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The max number of handshakes possible is: " + maxNumberOfHandShakes);
    }
}
