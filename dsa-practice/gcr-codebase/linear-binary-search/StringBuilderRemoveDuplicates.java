package BridgeLabz_Day27_LinearBinarySearch;

import java.util.*;
public class StringBuilderRemoveDuplicates {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Your string : ");
        String userInput = myScan.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char ch : userInput.toCharArray()) {
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }
        System.out.println("String formed without duplicates is : " + sb.toString());
    }
}
