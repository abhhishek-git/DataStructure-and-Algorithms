package dec2017;

public class LongestSpanWithSameSumInTwoBinaryArray_Naive {
	public static void main(String[] args) {
		int[] arr1 = {0,1,0,1,1,1,1};
		int[] arr2 = {1,1,1,1,1,0,1};
		int len = arr1.length;
		System.out.println("MaxLen: "+ longestSpan(arr1, arr2, len));
	}
	
	public static int longestSpan(int[] arr1, int[] arr2, int len) {
		int maxLen =0;
        //Points to take:
		//int sum1 =0, sum2=0;  Writing this statement here will change answer.
		for(int i=0; i<len; i++ ) {
			
			//Optimization1: adding this check ensures no check when maxLen is greater then
			//remaining array
			if(maxLen > len-i)
				break;
			int sum1 =0, sum2=0;
			for(int j=i; j<len; j++) {
				sum1 += arr1[j];
				sum2 += arr2[j];
				
				if(sum1 == sum2) {
					int length = j-i +1;
					if(length >maxLen) {
						maxLen= length;
					}
				}
			}
		}
		return maxLen;
	}
}
