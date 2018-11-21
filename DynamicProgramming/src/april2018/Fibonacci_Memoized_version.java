/*This code is still running in 2^n complexity.
 * If we look closely, inside fib() method, we are re initializing the array to -1 every time,
 * this is removing the previously calculated and saved values, defeating the purpose of saving
 * calculated values
 *  

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

*/


//This works fine

package april2018;

//O(n)
public class Fibonacci_Memoized_version {
	/*declare this array in global scope so that only one copy of it is created
	and same copy is available to all the call of method fib()*/
	
	static int[] lookup = new int[500];
	public static void main(String[] args) {

		lookup[0] =0;
		lookup[1] =1;
		for(int i=2; i<500 ; i++) {
			lookup[i] = -1;
		}
		System.out.println(fib(400));
	}
	
	public static int fib(int n) {
		
		// Memoization based solution
		if(lookup[n] != -1) {
			return lookup[n];			
		}
		lookup[n] =  fib(n-1)+ fib(n-2);
		return lookup[n];
		
	}
}

