package dec2017;

public class LongestSpanWithSameSumInTwoBinaryArray_Naive {
	public static void main(String[] args) {
		int[] arr1 = {0,1,0,1,1,1,1};
		int[] arr2 = {1,1,1,1,1,0,1};
		int len1 = arr1.length;
		int len2 = arr2.length;
		System.out.println("MaxLen: "+ longestSpan(arr1, arr2, len1, len2));
	}
	
	public static int longestSpan(int[] arr1, int[] arr2, int len1, int len2) {
		int maxLen =0;
        //Points to take:
		//int sum1 =0, sum2=0;  Writing this statement here will change answer.
		for(int i=0; i<len1; i++ ) {
			
			//Optimization1: adding this check ensures no check when maxLen is greater then
			//remaining array
			if(maxLen > len1-i)
				break;
			int sum1 =0, sum2=0;
			for(int j=i; j<len2; j++) {
				sum1 += arr1[j];
				sum2 += arr2[j];
				
				if(sum1 == sum2) {
					int len = j-i +1;
					if(len >maxLen) {
						maxLen= len;
					}
				}
			}
		}
		return maxLen;
	}
}
