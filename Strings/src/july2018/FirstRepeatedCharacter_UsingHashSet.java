package july2018;

import java.util.HashSet;

public class FirstRepeatedCharacter_UsingHashing {
	public static void main(String[] args) {
		String str ="geeksforgeeks";
		char[] arr = str.toCharArray();
		System.out.println(repeatingChar(arr));
	}
	
	public static char repeatingChar(char[] arr){
		HashSet<Character> hash = new HashSet<>();
		
		for(int i=0; i<arr.length;i++){
			char c = arr[i];
			
			if(hash.contains(c))
				return c;
			else
				hash.add(c);
		}
		return 0;
		
	}
}
