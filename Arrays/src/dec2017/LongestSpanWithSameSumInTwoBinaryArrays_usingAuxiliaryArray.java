package dec2017;

public class LongestSpanWithSameSumInTwoBinaryArrays_usingAuxiliaryArray {
	public static void main(String[] args) {
		int[] arr1 = {0,1,0,1,1,1,1};
		int[] arr2 = {1,1,1,1,1,0,1};
		int len = arr1.length;
		System.out.println("MaxLen: "+ longestCommonSpan(arr1, arr2, len));
	}
	public static int longestCommonSpan(int[] arr1, int[] arr2, int n) {
		int maxLen =0;
		int preSum1 =0, preSum2=0;
		
		int[] diff = new int[2*n+1];
		//initialize diff array with -1
		for(int i=0; i<diff.length; i++) {
			diff[i]= -1;
		}
		
		for(int i=0; i<n; i++) {
			preSum1 += arr1[i];
			preSum2 += arr2[i];
			
			int curr_diff= preSum1 - preSum2;
			int diffIndex = n + curr_diff;
			
			if(curr_diff ==0) {
				maxLen = i+1;
			}else if(diff[diffIndex] == -1){
				diff[diffIndex] = i;
			}else {
				int len = i - diff[diffIndex];
				if(len > maxLen) {
					maxLen = len;
				}
			}
		}
		
		return maxLen;
	}
}
