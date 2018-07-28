package july2018;

//This approach also takes O(n) only
public class FirstNonRepeatingCharacter {
	static char[] count = new char[256];
	
	static void getCharCountArray(String str){
		for(int i=0; i <str.length(); i++){
			count[str.charAt(i)]++;
		}
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeeks";
		int index = nonRepeatingChar(str);
		System.out.println(index == -1? "All chars are repeating" : 
			     "First non-repeating character is: "+ str.charAt(index));
			
	}
	
	public static int nonRepeatingChar(String str){
		getCharCountArray(str);
		
		int index =-1;
		for(int i=0 ;i<str.length();i++){
			if(count[str.charAt(i)]==1){
				index =i;
			    break;
			}
		}
		return index;
	}
}
