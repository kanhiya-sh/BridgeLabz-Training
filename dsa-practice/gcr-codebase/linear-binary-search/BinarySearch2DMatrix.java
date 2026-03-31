package BridgeLabz_Day27_LinearBinarySearch;

public class BinarySearch2DMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5},{7,9,11}};
        int target = 9;
        int r = mat.length;
        int c = mat[0].length;
        int l = 0;
        int h = r * c - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int val = mat[mid / c][mid % c];
            if (val == target) {
                System.out.println(true);
                return;
            }
            if (val < target) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        System.out.println(false);
    }
}