package april2018;

//O(n)
public class Fibonacci_Memoized_version {
	public static void main(String[] args) {
		System.out.println(fib(9));
	}
	
	public static int fib(int n) {
		//MAX is size of lookup table
		final int MAX = 100;
		final int NIL = -1;
		
		int[] lookup = new int[MAX];
		
		//initialize NIL values in lookup table
		for(int i=0; i<MAX ; i++) {
			lookup[i] = -1;
		}
		
		// Memoization based solution
		if(lookup[n] == NIL) {
			if(n <= 1)
				lookup[n] = n;
			else
				lookup[n] =  fib(n-1)+ fib(n-2);
		}
		return lookup[n];
	}
}
