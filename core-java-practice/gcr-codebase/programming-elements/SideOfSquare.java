

import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        double sideSquare = perimeter / 4.0 ;
        System.out.println("The length of the side is " + sideSquare + " whose perimeter is " + perimeter);
    }
}
