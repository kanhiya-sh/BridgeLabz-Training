import java.util.*;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int first_occ = -1, last_occur = -1;
        // first occur
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                first_occ = mid;
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        //last occur :
        start = 0;
        end = nums.length - 1 ;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last_occur = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] {first_occ, last_occur};
    }
}
