package april2018;

public class Fibonacci_using_plain_recursion {
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
	
	public static int fib(int n) {
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
}
