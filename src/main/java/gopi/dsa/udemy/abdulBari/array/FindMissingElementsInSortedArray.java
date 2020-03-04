/**
 * Created With Love By Gopi on 29-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

import java.util.Arrays;

/**
 * @author Gopi
 */
public class FindMissingElementsInSortedArray
{

	public static void main(String[] args)
	{
		int numbers[] = { 4, 5, 7, 10, 12, 15, 16 };
		int size = 13;
		int diff = 4; // start element
		System.out.println("Given Array: " + Arrays.toString(numbers));
		System.out.print("Missing Numbers: ");
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] - i != diff)
			{
				while (numbers[i] - i > diff)
				{
					System.out.print(diff + i + " ");
					diff++;
				}
			}

		}
	}
}
