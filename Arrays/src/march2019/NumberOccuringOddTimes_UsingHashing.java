package march2019;

import java.util.HashMap;
import java.util.Map;

public class NumberOccuringOddTimes_UsingHashing {
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		int n = arr.length;
		int result = getOddOccurance(arr, n);
		if(result == -1)
			System.out.println("No element is odd number of times");
		else
			System.out.println(result);
	}
	
	public static int getOddOccurance(int[] arr, int n){
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++){
			if(map.containsKey(arr[i])){
				int value = map.get(arr[i]); 
				map.put(arr[i], value+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		for(Integer a : map.keySet()){
			if(map.get(a) %2 != 0)
				return a;
		}
		
		return -1;	
	}
}
