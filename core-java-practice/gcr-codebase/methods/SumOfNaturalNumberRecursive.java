package Capgemini_Day8_Methods_Level2;

import java.util.*;
public class SumOfNaturalNumberRecursive {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = myScan.nextInt();
        SumOfNaturalNumberRecursive recursiveSum = new SumOfNaturalNumberRecursive();
        int ans1 = recursiveSum.sum(number); // sum using recursion
        int ans2 = number * (number + 1) / 2; // sum using formula
        System.out.println("Sum using recursion and formula are " + ans1+" "+ans2);
    }
    public int sum( int num ) {
        if(num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }
}
