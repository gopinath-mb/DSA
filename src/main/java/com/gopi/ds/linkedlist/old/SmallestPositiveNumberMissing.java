/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.linkedlist.old;

/**
 * @author gopinath_mb
 *         https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number/1/?track=SPCF-Arrays&batchId=154
 */
public class SmallestPositiveNumberMissing
{

  public static void main(String[] args)
  {
    int[] arr = {0, -10, 1, 3 ,-20};
    System.out.println(missingNumber(arr, arr.length));
  }
  static int missingNumber(int arr[], int size)
  {
    int[] hash = new int[1000000];
    
    for (int i = 0; i < size; i++)
    {
      if (arr[i] >= 0)
      {
        hash[arr[i]] = 1;
      }
    }
    int j=(arr[0]>=0?arr[0]:0);
    for (int i = j; i < hash.length; i++)
    {
      if (hash[i] == 0)
      {
        return i;
      }
    }
    return 0;

    // Your code here

  }
}
