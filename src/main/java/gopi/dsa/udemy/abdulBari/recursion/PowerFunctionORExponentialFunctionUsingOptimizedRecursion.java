/**
 * Created With Love By Gopi on 23-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * Number of recursive calls got reduced.
 * 
 * @author Gopi
 */
public class PowerFunctionORExponentialFunctionUsingOptimizedRecursion {

	private static int pow(int m, int n) {
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			return pow(m * m, n / 2);
		} else {
			return pow(m * m, (n - 1) / 2) * m;
		}
	}

	public static void main(String[] args) {
		int m = 2;
		int n = 9;
		System.out.println("pow(2,9) is :" + pow(m, n));
	}
}
