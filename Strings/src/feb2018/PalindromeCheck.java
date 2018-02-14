package feb2018;

public class PalindromeCheck {
	public static void main(String[] args) {
		    isPalindrome("abba");
		   isPalindrome("abbccbba");
		    isPalindrome("geeks");
	}
	
	private static void isPalindrome(String str) {
		int l=0;
		int h = str.length()-1;
		
		while(l<h) {
			if(str.charAt(l++) != str.charAt(h--)) {
				//l++;
				//h--;
				System.out.println(str+ ": Given String is not Palindrome");
				return;
			}
		}
		System.out.println(str+ " : Given String is Palindrome");
	}
}
