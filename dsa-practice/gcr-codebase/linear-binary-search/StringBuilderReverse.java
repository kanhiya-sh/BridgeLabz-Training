package BridgeLabz_Day27_LinearBinarySearch;

import java.util.*;
public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Your string : ");
        String userInput = myScan.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(userInput);
        sb.reverse();
        String reverseString = sb.toString();
        System.out.println("Reversed string is : " + reverseString);
    }
}
