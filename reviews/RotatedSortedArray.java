//find an element from an rotated sorted array
//[4, 5, 6, 7, 0, 1, 2] , k = 1

public class RotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int k = 1;
		System.out.println(find(arr, k));
		
	}
	public static int find(int [] arr , int k ) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == k ) {
				return arr[mid];
			}
			else if (arr[mid] > k && k > arr[mid + 1]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1 ;
	}
}