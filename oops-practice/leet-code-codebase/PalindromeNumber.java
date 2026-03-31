package BridgeLabz_Day18_Leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome Number.");
        }
        else {
            System.out.println(number + " is not a Palindrome Number.");
        }
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
}
