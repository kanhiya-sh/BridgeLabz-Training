public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = { -1,0,3,5,9,12 };
        int target = 9;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
//  if middle element is same as that of the target than our work is done and we will return the ans that is mid . 
            if(nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
