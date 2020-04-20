/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

/**
 * @author gopinath_mb
 */
public class MaxOccuredElement
{

  public static void main(String[] args)
  {

    int[] arr = { 1, 4, 3, 1 };
    int[] arr1 = { 15, 8, 5, 4 };
    ArrayUtil.display(arr);
    ArrayUtil.display(arr1);
    System.out.println(maxOccured(arr, arr1, 4, 15));
    
    
    
    int[] arr2 = {1, 5, 9, 13, 21};
    int[] arr3 = {15, 8, 12, 20, 30};
    ArrayUtil.display(arr2);
    ArrayUtil.display(arr3);
    System.out.println(maxOccured(arr2, arr3, 5, 30));
  }

  public static int maxOccured(int L[], int R[], int n, int maxx)
  {

    int[] hash = new int[maxx + 2];
    for (int i = 0; i < n; i++)
    {
      hash[L[i]] =hash[L[i]] + 1;
      hash[R[i] + 1] =hash[R[i] + 1] -1;
    }
    int min_index = 1;
    int pre_sum = hash[1];
    int max_sum = pre_sum;
    for (int i = 2; i <= maxx; i++)
    {
      pre_sum += hash[i];
      if (pre_sum > max_sum)
      {
        max_sum = pre_sum;
        min_index = i;
      }
    }

    return min_index;

  }

}
