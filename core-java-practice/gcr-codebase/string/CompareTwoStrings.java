

import java.util.Scanner;
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean charAtResult = compareUsingCharAt(str1, str2);

        boolean resultEquals = str1.equals(str2);

        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + resultEquals);

        // Check if both results are same
        if (charAtResult == resultEquals) {
            System.out.println("Both results are SAME");
        }
        else {
            System.out.println("Results are DIFFERENT");
        }
    }
    public static boolean compareUsingCharAt(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        for(int i= 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
