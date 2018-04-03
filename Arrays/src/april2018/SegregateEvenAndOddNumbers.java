package april2018;
//O()n
//Similar to segregate 0 and 1 in an array, and both of these problems are variation of famous Dutch national flag problem
public class SegregateEvenAndOddNumbers {
	public static void main(String[] args) {
		int[] arr = {12, 34, 45, 9, 8, 90, 3};
		int len = arr.length;
		segregateEvenOdd(arr, len);
		for(int i=0; i< len; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void segregateEvenOdd(int[] arr, int n) {
		int left= 0, right =n-1;
		
		while(left < right) {
			while(arr[left]%2 ==0 && left <right)
				left++;
			
			while(arr[right]%2 ==1 && left < right)
				right--;
			
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}
}
