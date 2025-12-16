import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = { 2, 7, 11, 15 };
        int target = 9;
        int [] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // we will here do Arrays.toString to print the output
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] arr = new int[2]; // here both the indexes will be stored which combinedly forms the sum

        for(int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first ;
//            we will check if the second number is in the map or not if it is there than the question is solved.
            if(map.containsKey(second)){ 
                arr[0] = map.get(second);
                arr[1] = i;
                return arr;
            }
            map.put(first, i); // if second is not found in the map than we will put it in the map
        }
        return arr;
    }
}