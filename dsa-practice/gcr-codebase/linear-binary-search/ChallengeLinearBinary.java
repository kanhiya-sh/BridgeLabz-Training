package BridgeLabz_Day27_LinearBinarySearch;

import java.util.Arrays;
public class ChallengeLinearBinary {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        boolean[] seen = new boolean[arr.length + 1];
        for (int x : arr) {
            if (x > 0 && x <= arr.length) seen[x] = true;
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!seen[i]) {
                System.out.println(i);
                break;
            }
        }
        Arrays.sort(arr);
        int target = 3;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            if (arr[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        System.out.println(-1);
    }
}