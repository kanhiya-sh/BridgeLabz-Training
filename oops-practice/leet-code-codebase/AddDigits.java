package BridgeLabz_Day18_Leetcode;

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println("The result after adding digits of " + num + " is: " + addDigits(num));
    }
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
