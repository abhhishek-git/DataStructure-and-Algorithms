package april2018;

public class Segregate0and1inArray_usingTwoIndexes {
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
		int left = 0;
		int right = n-1;
		
		while(left < right) {
			//Increment left index while we see 0 at left
			while(arr[left] == 0 && left < right) 
				left ++;
			
			//Decrement right index while we see 1 at right index
			while(arr[right] == 1  && left < right)
				right --;
			
			/*If left is smaller than right then there is a 1 at left and a 0 at right.
			 * Exchange arr[left] and arr[right]
             */			
			if(left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left ++;
				right --;
			}
		}
	}
}
