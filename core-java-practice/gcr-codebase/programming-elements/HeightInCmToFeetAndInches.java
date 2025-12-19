

import java.util.Scanner;

public class HeightInCmToFeetAndInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heightInCm = scanner.nextDouble();
        double totalInches = heightInCm / 2.54;
        int inFeet = (int) (totalInches / 12);
        double inInches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + inFeet + " and inches is " + inInches);
    }
}
