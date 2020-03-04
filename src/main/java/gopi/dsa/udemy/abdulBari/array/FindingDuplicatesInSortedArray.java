/**
 * Created With Love By Gopi on 29-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

import java.util.Arrays;

/**
 * @author Gopi
 */
public class FindingDuplicatesInSortedArray
{

	public static void main(String[] args)
	{
		int[] numbers = { 3, 6, 6, 6, 9, 11, 12, 15, 15 };
		int lastDuplicate = -1;
		int numberOfTimesDupilicated = 0;
		System.out.println("Given array: " + Arrays.toString(numbers));
		System.out.print("Duplicate numbers are :");
		int j;
		for (int i = 0; i < numbers.length - 1;i++ )
		{

			if (numbers[i] == numbers[i + 1])
			{
				j = i + 1;

				while ( j<numbers.length && numbers[i] == numbers[j] )
				{
					numberOfTimesDupilicated++;
					j++;
				}
				System.out.println(numbers[i]+" appeared "+numberOfTimesDupilicated + " times.");
				numberOfTimesDupilicated=0;
				i=j-1;

			}
		}
	}

}
