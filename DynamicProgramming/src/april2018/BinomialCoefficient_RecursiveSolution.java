package april2018;

// Value of C(n,k) can be recursively calculated using following standard formula for Binomial Coefficients
//* C(n,k) = C(n-1, k-1)+ C(n-1, k)
//* C(n,0) = C(n,n) =1
public class BinomialCoefficient_RecursiveSolution {
	public static void main(String[] args) {
		System.out.println(binomial(4,2));
	}
	
	public static int binomial(int n, int k) {
		if(k==0 || k==n)
			return 1;
		else
			return binomial(n-1, k-1)+ binomial(n-1, k);
		
	}
}
