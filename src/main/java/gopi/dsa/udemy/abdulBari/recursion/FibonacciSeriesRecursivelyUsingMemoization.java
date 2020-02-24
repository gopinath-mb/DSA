/**
 * Created With Love By Gopi on 24-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * @author Gopi
 */
public class FibonacciSeriesRecursivelyUsingMemoization {

	private static int[] mem = new int[10];

	static int fib(int n) {
		if (n <= 1) {
			mem[n] = n;
			return n;
		} else {
			if (mem[n - 1] == -1) {
				mem[n - 1] = fib(n - 1);
			}
			if (mem[n - 2] == -1) {
				mem[n - 2] = fib(n - 2);
			}
			return mem[n - 2] + mem[n - 1];
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			mem[i] = -1;
		}
		System.out.println("9th Fibonacci number is :" + FibonacciSeriesRecursivelyUsingMemoization.fib(9));
	}
}
