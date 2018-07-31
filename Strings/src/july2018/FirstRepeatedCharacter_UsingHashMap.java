package july2018;

//https://algorithms.tutorialhorizon.com/find-the-first-repeating-character-in-a-given-string/
//Note that this method using HashMap will give different than HashSet, as this method first 
//creates the Map and then check one by one. Hence for "geeksforgeeks" , output is g
//while output is e using HashSet method
//but latest code will give same result as HashSet...smaller ans better
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharacter_UsingHashMap {
	public static void main(String[] args) {
		String str ="geeksforgeeks";
		Character result = firstRecurringChar(str);
		
		if(result != null)
			System.out.println("First repeating character is: "+ result);
		else
			System.out.println("There is no repeating character");
	}
	
	public static Character firstRecurringChar(String str){
		str = str.replaceAll(" ", "");
		Character repeatChar =null;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i< str.length();i++){
			Character chr = str.charAt(i);
			if(map.containsKey(chr))
				//map.put(chr, map.get(chr)+1);
				return chr;
			else
				map.put(chr, 1);
		}
		
		/*for(int i=0; i<str.length();i++){
			if(map.get(str.charAt(i))>1){
				repeatChar = str.charAt(i);
			    break;
			}
		} */
		
		return repeatChar;
	}
}
