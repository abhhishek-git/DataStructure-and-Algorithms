package july2018;

import java.util.HashMap;
class CountIndex{
	int count, index;
	
	public void incCount(){
		this.count++;
	}
}
public class FirstNonRepeatingCharacter_UsingHashMap {
	static char[] count = new char[256];
	static HashMap<Character, CountIndex> hm = new HashMap<>(256);
	
	static void getCharCountArray(String str){
		for(int i=0; i< str.length(); i++){
			if(hm.containsKey(str.charAt(i))){
				hm.get(str.charAt(i)).incCount();
			}else{
				hm.put(str.charAt(i), )
			}
		}
	}
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int index = nonRepeatingChar(str);
	}
	
	public static int nonRepeatingChar(String str){
		getCharCountArray(str);
		return 0;
	}
}
