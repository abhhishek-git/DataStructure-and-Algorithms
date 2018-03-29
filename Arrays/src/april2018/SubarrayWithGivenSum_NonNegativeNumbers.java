package april2018;
//O(n)

public class SubarrayWithGivenSum_NonNegativeNumbers {
	public static void main(String[] args) {
		//int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
		int[] arr = {1,2,4,0,0,4,10,5};
		int len = arr.length;
		int sum = 8;
		subArraySum(arr,len, sum);
	}
	
	public static int subArraySum(int[] arr, int n, int sum) {
		int curr_sum = arr[0];
		int start= 0, i;

		for(i=1; i<=n ;i++) {
			//putting if condition here will not work, as we need to remove elements till sum becomes less than curr_sum
			// and if will remove element only once for each loop
			//e.g if condition will not work for this array {1,2,4,0,0,4,10,5}. 
			while(curr_sum > sum) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			
			if(curr_sum == sum) {
				System.out.printf("Sum found between indexes %d and %d ", start, i-1);
				//If we don't put return statement then "No subarray found" will always be printed, even id subarray is present 
				return 1;
			}
			if(i< n)
				curr_sum = curr_sum+ arr[i];
		}
		System.out.println("No subarray found");
		return 0;
	}

}
