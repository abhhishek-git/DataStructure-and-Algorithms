package feb2018;

public class LeadersInArray_Simple {
	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3 ,5 ,2};
		int size = arr.length;
		printLeader(arr, size);
	}
	private static void printLeader(int[] arr, int n) {
		int i,j;
		for(i=0; i<n; i++) {
			for(j=i+1 ; j<n ;j++) {
				if(arr[i] <= arr[j]) 
					break;
			}
			//critical line
			if(j == n)
				 System.out.print(arr[i]+" ");
			
		}
		
	}
}
