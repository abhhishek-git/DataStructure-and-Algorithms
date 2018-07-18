package july2018;

public class PalindromeCheck {
	public static void main(String[] args) {
		isPalindrome("adda");
		isPalindrome("abbccbba");
	    isPalindrome("geeks");
	}
	
	public static void isPalindrome(String str){
		int low = 0;
		int high = str.length()-1;
		
		while(low < high){
			if(str.charAt(low++) != str.charAt(high--)){
				System.out.println("Not a palindrome");
				/*
				 * If we increment low and decrement high here only, 
				 * and not inside if condition [e.g str.charAt[l++], then
				 * low will always be less than high and Outside if loop will be 
				 * printed infinite times
				 */
				//low++;
				//high--;
				return;
			}
			System.out.println("Outside if loop");
		}
		System.out.println(str+ " is a plalindrome");
				
	}

}
