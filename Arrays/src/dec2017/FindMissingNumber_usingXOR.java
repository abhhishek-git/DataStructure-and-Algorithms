package dec2017;

public class FindMissingNumber_usingXOR {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7};
		int len = arr.length;
		System.out.println(missingNumber(arr, len));
	}

	public static int missingNumber(int[] arr, int n) {
		int x1=arr[0]; //for xor of all the elements in the given array
		int x2=1; //for xor of all the elements from 1 to n+1
		for(int i=1; i< n; i++)
			x1 = x1^arr[i];
		for(int i=2 ; i<=n+1 ;i++)
			x2 = x2^i;
		
		return x1^x2;
	}
}
