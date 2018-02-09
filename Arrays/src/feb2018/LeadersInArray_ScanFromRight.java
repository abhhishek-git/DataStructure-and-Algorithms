package feb2018;

public class LeadersInArray_ScanFromRight {
	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3 ,5 ,2};
		int size = arr.length;
		printLeader(arr, size);
	}
	private static void printLeader(int[] arr, int n) {
		int max_from_right = arr[n-1];
		System.out.print(arr[n-1]+" ");
		for(int i =n-2; i >= 0; i--) {
			if(max_from_right < arr[i]) {
				max_from_right =arr[i];
				System.out.print(max_from_right+ " ");
			}
		}
	}
}
