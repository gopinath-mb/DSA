/**
 * Created With Love By Gopi on 29-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

import java.util.Arrays;

/**
 * @author Gopi
 */
public class FindMissingElementsInUnSortedArray
{

	public static void main(String[] args)
	{
		int numbers[] = { 16, 7, 4, 5, 12, 10, 15 };
		int size = 13;
		int bitSet[] = new int[size];
		int startElement = 4; // start element
		System.out.println("Given Array: " + Arrays.toString(numbers));
		System.out.print("Missing Numbers: ");
		for (int i = 0; i < numbers.length; i++)
		{
			bitSet[numbers[i] - startElement] = 1;
		}

		for (int i = 0; i < bitSet.length; i++)
		{
			if (0 == bitSet[i])
			{
				System.out.print(i + startElement +" ");
			}
		}
	}
}
