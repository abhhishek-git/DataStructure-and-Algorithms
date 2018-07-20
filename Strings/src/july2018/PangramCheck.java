package july2018;

/*
 * A Pangram is a sentence containing every letter in english alplabet.
 * 
 * Output of System.out.println('Z'-'A'); --> 25
 * Output of System.out.println('z'-'a'); --> 25
 * 
 * Also
 * char a = 'A';
 * System.out.println( (int) a);
 * Output = 65
 */
public class PangramCheck {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		if(panagramCheck(str))
			System.out.println("It's a panagram");
		else
			System.out.println("Not a panagram");
		
}
	
	public static boolean panagramCheck(String str){
		boolean[] mark = new boolean[26];
		int index =0;
		for(int i=0; i<str.length(); i++){
		  if('A' <= str.charAt(i) && str.charAt(i)<= 'Z')
			  index = str.charAt(i)-'A';
		  else if('a'<= str.charAt(i) && str.charAt(i)<='z')
			  index = str.charAt(i)-'a';
		  //Mark current character
		  mark[index] =true;
		}
		//Return false if any character is unmarked
		for(int i=0; i<=25; i++){
			if(mark[i] == false)
				return false;
		}
		//If all characters were present
		return true;
			
	}
}
