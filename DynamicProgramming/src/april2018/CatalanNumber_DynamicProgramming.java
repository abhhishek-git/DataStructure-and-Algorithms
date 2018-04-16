package april2018;

//O(n^2) -> improvement over recursive solution
public class CatalanNumber_DynamicProgramming {
	public static void main(String[] args) {
		System.out.println(catalan(4));
	}
	
	public static long catalan(int n) {
		long[] catalan = new long[n+1];
		
		catalan[0]= catalan[1]=1;
		
		for(int i=2; i<= n;i++) {
			//catalan[i] =0;
			for(int j=0; j<i; j++) {
				catalan[i] += catalan[j] * catalan[i-j-1];
			}
		}
		
		return catalan[n];
	}
}
