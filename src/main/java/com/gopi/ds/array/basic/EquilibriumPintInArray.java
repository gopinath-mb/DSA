/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

/**
 * @author gopinath_mb
 */
public class EquilibriumPintInArray
{
  public static void main(String[] args)
  {
    long[] arr = { 3,1, 5, 2, 2 };
    System.out.println(equilibriumPoint(arr, arr.length));
    long[] arr1 = { 1 };
    System.out.println(equilibriumPoint(arr1, arr1.length));
  }

//Function to find equilibrium point
  // a: input array
  // n: size of array
  public static int equilibriumPoint(long arr[], int n)
  {
    if(n==1)
    {
      return 1;
    }
    long left_sum =arr[0] ;
    long right_sum = 0;
    for (int i = 1; i < arr.length; i++)
    {
      right_sum += arr[i];
    }
    for (int i = 1; i < arr.length-1; i++)
    {
      right_sum-=arr[i];
      if(left_sum==right_sum)
      {
        return i+1;
      }
      left_sum+=arr[i];
      
    }
    return -1;

    // Your code here
  }
}
