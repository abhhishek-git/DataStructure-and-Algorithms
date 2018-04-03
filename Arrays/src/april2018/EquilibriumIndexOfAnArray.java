package april2018;

/*O(n)
we can remove the return statement and add a print statement to print all equilibrium indexes 
instead of returning only one.
*/
public class EquilibriumIndexOfAnArray {
	public static void main(String[] args) {
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		int len = arr.length;
	    System.out.println(equilibriumIndex(arr, len));
	}
	
	public static int equilibriumIndex(int[] arr, int n) {
		int sum = 0, leftSum =0;
		for(int i=0; i< n ; i++) {
			sum += arr[i];
		}
		
		for(int i=0; i< n; i++) {
			sum -= arr[i];
			if(leftSum == sum)
				return i;
			leftSum += arr[i];
		}
		return -1;
	}
}
