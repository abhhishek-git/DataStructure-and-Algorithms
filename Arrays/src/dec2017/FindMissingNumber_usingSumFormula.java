package dec2017;
//O(n)
public class FindMissingNumber_usingSumFormula {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7};
		int len = arr.length;
		System.out.println(missingNumber(arr, len));
	}
	public static int missingNumber(int[] arr, int n) {
		int sum = (n+1)*(n+2)/2;
		
		for(int i=0; i< n;i++) {
			sum -= arr[i];
		}
		return sum;
	}
}
