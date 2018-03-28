package feb2018;

public class RemovePalindromeWords {
	public static void main(String[] args) {
		String str = "Text contains malayalam and level words";
		System.out.println();
	}
	
	public static String removePalinWords(String str) {
		//'final_string' to store the final string 
		//'word' to one by one store each word of 'str'
		String final_string ="", word ="";
		
		//add space at the end of str, to satisfy this condition for last word: if(str.charAt(i) != ' ')
		str= str+ " ";
		
		int n = str.length();
		System.out.println(n);
		
		for(int i=0; i<n ;i++) {
			if(str.charAt(i) != ' ')
				word = word + str.charAt(i);
			else {
				if(!(isPalindrome(word)))
					final_string += word +" ";
				//reset
				word ="";
			}
		}
		
		return final_string;
	}

	private static boolean isPalindrome(String word) {
		int l=0, h =word.length()-1;
		
		while(l<h) {
			if(word.charAt(l++) != word.charAt(h--))
				return false;
		}
		return true;
	}
}
