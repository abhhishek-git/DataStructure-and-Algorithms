package april2018;

//O(n)
// Unlike the Tabulated version, all entries of the lookup table are not necessarily filled in Memoized version.
public class Fibonacci_Tabulation_version {
	public static void main(String[] args) {
		System.out.println(fib(9));
	}
	
	public static int fib(int n) {
		int[] lookup = new int[n+1];
		lookup[0] = 0;
		lookup[1] = 1;
		
		for(int i=2; i<=n; i++) {
			lookup[i]= lookup[i-1]+ lookup[i-2];
		}
		return lookup[n];
	}
}
