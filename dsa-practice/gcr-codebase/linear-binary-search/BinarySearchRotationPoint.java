package BridgeLabz_Day27_LinearBinarySearch;

public class BinarySearchRotationPoint {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[r]) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        System.out.println(l);
    }
}