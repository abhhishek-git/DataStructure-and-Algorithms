package april2018;

public class Segregate0and1inArray_bycounting0or1 {
	public static void main(String[] args) {
		int[] arr = {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int len = arr.length;
		segregateOand1(arr, len);
		
		System.out.println("Array after segregation of 0 and 1 : ");
		
		for(int i=0; i<len ;  i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void segregateOand1(int[] arr, int n) {
		//count the number of zeros in an array
		int count_0 =0;
		for(int i=0;i <n; i++) {
			if(arr[i] == 0) 
				count_0++;
		}
		
		//loop fill the array with zero until count
		for(int i=0; i< count_0 ;i++)
			arr[i] = 0;
		
		//loop fills the remaining array space with 1
		for(int i =count_0 ;i<n ;i++)
			arr[i] = 1;
	}
}
