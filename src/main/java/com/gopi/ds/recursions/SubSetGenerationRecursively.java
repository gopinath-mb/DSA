/**
 * Created With Love By Gopi on 28-Mar-2020
 */
package com.gopi.ds.recursions;

/**
 * @author Gopi
 */
public class SubSetGenerationRecursively
{

	public static void subSetGeneration(String originalString,int index,String subSet)
	{
		
		int length = originalString.length();
		if(length==index)
		{
			System.out.print(" "+subSet);
			return;
		}
		subSetGeneration(originalString, index+1, subSet+originalString.charAt(index));
		subSetGeneration(originalString, index+1, subSet);
	}
	
	
	public static void main(String[] args)
	{
		
		String originalString="abc";
		int startIndex=0;
		String subString="";
		subSetGeneration(originalString, startIndex, subString);
	}
}
