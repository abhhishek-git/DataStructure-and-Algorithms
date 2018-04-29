package april2018;

//binomial coefficient is found in same way
//using nCr formula
public class BinomialCoefficient_CalculateValueof_nCr {
	public static void main(String[] args) {
		int n= 5, r=2;
		System.out.println("nCr = "+ fact(n)/(fact(r)*fact(n-r)));
	}
	public static int fact(int n) {
		int res =1;
		for(int i=2; i<=n;i++) {
			res *= i;
		}
		return res;
		
	}
}
