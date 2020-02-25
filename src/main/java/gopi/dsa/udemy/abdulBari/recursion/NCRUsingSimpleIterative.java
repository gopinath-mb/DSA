/**
 * Created With Love By Gopi on 25-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

import junit.framework.Assert;

/**
 * @author Gopi
 */
public class NCRUsingSimpleIterative {

	private static int ncr(int n,int r)
	{
		int i=FactorialOfANumber.fact(n);
		int j=FactorialOfANumber.fact(r);
		int k=FactorialOfANumber.fact(n-r);
		return i/(j*k);
	}
	public static void main(String[] args) {
		
		System.out.println("4c2 :" +ncr(4,2));
		System.out.println("5c2 :" +ncr(5,2));
		System.out.println("6c5 :" +ncr(6,5));
		
	}
}
