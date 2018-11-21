package april2018;

//T(n) = T(n-1) + T(n-2) + O(1) -> to sum both results
//where, T(n<= 1) = O(1)
//Intuitively , T(n)= O(2^n)
public class Fibonacci_using_plain_recursion {
	public static void main(String[] args) {
		System.out.println(fib(30));
	}
	
	public static int fib(int n) {
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
}
