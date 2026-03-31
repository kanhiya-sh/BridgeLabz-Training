
import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        int largestNumber = firstNumber; // in the start assume first number is largest
        if(secondNumber > largestNumber) { // if second number is greater than largestNumber
            largestNumber = secondNumber;
        }
        if(thirdNumber > largestNumber) { // if third number is greater than largestNumber
            largestNumber = thirdNumber;
        }
        System.out.println("Is the first number the largest? " + (largestNumber == firstNumber));
        System.out.println("Is the second number the largest? " + (largestNumber == secondNumber));
        System.out.println("Is the third number the largest? " + (largestNumber == thirdNumber));
    }
}
