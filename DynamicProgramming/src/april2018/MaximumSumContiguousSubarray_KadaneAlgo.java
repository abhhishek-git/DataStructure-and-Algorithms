package april2018;

public class MaximumSumContiguousSubarray_KadaneAlgo {
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int len = arr.length;
		System.out.println(maxSumSubarray(arr, len));
	}
	public static int maxSumSubarray(int[] arr,int n) {
		int max_so_far =0, current_max  = 0;
		
		for(int i=0; i<n;i++) {
			current_max = Math.max(0, current_max+ arr[i]);
			max_so_far = Math.max(current_max, max_so_far);
		}
		return max_so_far;
	}
}
