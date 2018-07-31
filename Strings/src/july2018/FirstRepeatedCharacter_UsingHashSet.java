package july2018;

//Note that this method using HashSet will give different than HashMap, as other method first 
//creates the Map and then check one by one. Hence for "geeksforgeeks" , output is g using HashMap
//while output is e using HashSet method
import java.util.HashSet;

public class FirstRepeatedCharacter_UsingHashSet {
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
