package BridgeLabz_Day29_Leetcode;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int ans = Operation(n, start);
        System.out.println(ans);
    }
    public static int Operation(int n, int start) {
        int ans = start;
        for(int i = 1; i < n; i++) {
            ans ^= ( start + 2 * i );
        }
        return ans;
    }
}
