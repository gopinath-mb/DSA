/**
 * Created With Love By Gopi on 23-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * @author Gopi
 */
public class PowerFunctionORExponentialFunctionUsingRecursion {

	private static int pow(int m, int n) {
		if (n == 0) {
			return 1;
		} else {
			return pow(m, n - 1) * m;
		}
	}

	public static void main(String[] args) {
		int m = 2;
		int n = 9;
		System.out.println("Pow(2,9) is :" + pow(m, n));
	}
}
