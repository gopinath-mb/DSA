/**
 * Created With Love By Gopi on 28-Mar-2020
 */
package com.gopi.ds.recursions;

/**
 * @author gopinathjnv
 */
public class PalindromeOrNotUsingRecursion
{

	public static boolean isPAlindrome(String str, int start, int end)
	{
		if (start >= end)
		{
			return true;
		}
		if (str.charAt(start) != str.charAt(end))
		{
			return false;
		}
		return isPAlindrome(str, start + 1, end - 1);
	}

	public static void main(String[] args)
	{
		String palindromCheckString = "malayalam";
		System.out.println(isPAlindrome(palindromCheckString, 0, palindromCheckString.length() - 1));
		 palindromCheckString = "nitin";
		System.out.println(isPAlindrome(palindromCheckString, 0, palindromCheckString.length() - 1));
		 palindromCheckString = "gopi";
		System.out.println(isPAlindrome(palindromCheckString, 0, palindromCheckString.length() - 1));
		 palindromCheckString = "";
		System.out.println(isPAlindrome(palindromCheckString, 0, palindromCheckString.length() - 1));
	}
}
