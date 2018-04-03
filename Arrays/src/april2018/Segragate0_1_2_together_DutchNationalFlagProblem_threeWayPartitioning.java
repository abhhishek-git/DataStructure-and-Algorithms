package april2018;

//O(n)

public class Segragate0_1_2_together_DutchNationalFlagProblem_threeWayPartitioning {
	public static void main(String[] args) {
		int[] arr ={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int len = arr.length;
		sort012(arr, len);
		 for (int i = 0; i < len; i++)
	            System.out.print(arr[i]+" ");
	        System.out.println("");
	}
	
	public static void sort012(int[] arr, int n) {
		int low =0, mid =0, high = n-1, temp;
		while(mid <= high) {
			switch(arr[mid]) {
			case 0:
			{
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low ++;
				mid ++;
				break;
			}
			case 1:
			{
				mid++;
				break;
			}
			case 2:
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high]= temp;
				high--;
				break;
			}
			
		}
	}
}
