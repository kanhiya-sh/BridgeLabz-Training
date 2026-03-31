public class squareRootBinarySearch {
    public static void main(String [] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        if(x < 2) return x; // If x is 0 or 1 than square root is the number itself .
        while ( start <= end ) {
            int mid = start + (end - start) / 2;
            if( mid == x / mid) { // If mid * mid == x -> here we are using division to avoid overflow .
                return mid;
            }
            else if (mid > x / mid) {
                end = mid - 1 ;
            }
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
