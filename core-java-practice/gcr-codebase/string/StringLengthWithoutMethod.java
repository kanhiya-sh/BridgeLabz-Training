

import java.util.Scanner;

public class StringLengthWithoutMethod {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputStr = my_scan.next();
        int counter = 0;
        try {
            while (true) {
//                here we are checking each character and increasing the counter.
                inputStr.charAt(counter);
                counter++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
//            in this we are passing an error which will stop the loop when index goest outside the bounds of string
        }
        System.out.println("Length of the string without any length function is: " + counter);
        System.out.println("Length using built-in length(): " + inputStr.length());

    }
}
