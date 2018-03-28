package april2018;

//this implementation of Kadane's algo also handles cases where all numbers are negative
public class MaximumSumContiguousSubarrayAllNegativeNo_KadaneAlgo {
	public static void main(String[] args) {
		int arr[] = {-12, -3, -7, -8, -5, -6};
		int len = arr.length;
		System.out.println(maxSumSubarray(arr, len));
	}
	public static int maxSumSubarray(int[] arr,int n) {
		int max_so_far =arr[0], current_max  = arr[0];
		
		for(int i=1; i<n;i++) {
			current_max = Math.max(arr[i], current_max+ arr[i]);
			max_so_far = Math.max(current_max, max_so_far);
		}
		return max_so_far;
	}
}
