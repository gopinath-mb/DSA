/**
 * Created With Love By Gopi on 24-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * @author Gopi
 */
public class FibonacciSeriesRecursively {

	static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {

		System.out.println("6th Fibonacci number is :" + FibonacciSeriesRecursively.fib(6));
	}
}
