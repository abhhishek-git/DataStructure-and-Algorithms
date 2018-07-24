package july2018;

public class PangramMissingCharacters {
	public static void main(String[] args) {
		String str = "he quick brown fox jumps over the dog";
		missingChar(str);
	}
	
	public static void missingChar(String str){
		boolean[] mark = new boolean[26];
		
		int index = 0;
		
		// no need to make every mark as false. Since local variables are initialized by default
		// So boolean mark is false by default 
		/*for(int i=0; i<mark.length; i++)
			mark[i] = false;*/
		
		for(int i=0; i < str.length(); i++){
			if(str.charAt(i) > 'A' && str.charAt(i) < 'Z')
				index = str.charAt(i) - 'A';
			else if(str.charAt(i)> 'a' && str.charAt(i)< 'z')
				index = str.charAt(i) - 'a';
			mark[index] = true;
		}
		
		for(int i=0; i<mark.length; i++){
			if(mark[i] == false)
				//See syntax carefully. charater's interger value when typecaseted to char, 
				//gives char
				System.out.print((char)(i +'a') + " ");
		}
	}
}
