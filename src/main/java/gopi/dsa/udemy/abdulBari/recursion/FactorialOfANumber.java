/**
 * Created With Love By Gopi on 23-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * @author Gopi
 */
public class FactorialOfANumber {

	private static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return fact(n - 1) * n;
		}
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factorial of " + n + " is :" + fact(n));
	}
}
