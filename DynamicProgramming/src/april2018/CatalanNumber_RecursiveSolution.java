package april2018;

//O(2^n) -> exponential 
public class CatalanNumber_RecursiveSolution {
	public static void main(String[] args) {
		System.out.println(catalan(4));
	}
	
	public static long catalan(int n) {
	   long result= 0;
	   
	   //Base case
	   if(n<=1)
		   return 1;
	   
	   //catalan(i) is sum of catalan(i)* catalan(n-i-1)
	   for(int i=0; i<n ; i++) {
		   result += catalan(i)* catalan(n-i -1);
	   }
		return result;   
	}
}
