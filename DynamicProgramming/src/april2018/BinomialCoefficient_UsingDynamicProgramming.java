package april2018;
//overlapping subproblem
// constructing a temporary array C[][] in bottom up manner.
public class BinomialCoefficient_UsingDynamicProgramming {
	public static void main(String[] args) {
		int n= 5;
		int k=2;
		System.out.println(binomial(n,k));
	}
	
	public static int binomial(int n, int k) {
		int[][] C = new int[n+1][k+1];
		
		for(int i=1; i<=n ;i++) {
			//for(int j=0; j<= Math.min(i, k); j++) {
			for(int j=0; j<= k; j++) {
				if(j==0 || j==i) {
					System.out.println("i:"+i+ "  j:"+ j);
					C[i][j]=1;	
				}
				else {
					System.out.println("i:"+i+ "  j:"+ j);
					C[i][j] =  C[i-1][j-1]+ C[i-1][j];
				}
			}
		}
		return C[n][k];
	}
}
