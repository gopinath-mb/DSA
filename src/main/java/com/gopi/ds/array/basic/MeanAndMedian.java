/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

import java.util.Arrays;

/**
 * @author gopinath_mb
 */
public class MeanAndMedian
{

  public static void main(String[] args)
  {

    int[] arr = {1 , 2 ,19 ,28, 5};
    ArrayUtil.display(arr);
    System.out.println(new MeanAndMedian().mean(arr, arr.length));
    System.out.println(new MeanAndMedian().median(arr, arr.length));
//    convertToWave(arr, arr.length);
    ArrayUtil.display(arr);
    int[] arr1 = {2 ,8 ,3 ,4};
    ArrayUtil.display(arr1);
//    convertToWave(arr1, arr1.length);
    System.out.println(new MeanAndMedian().mean(arr1, arr1.length));
    System.out.println(new MeanAndMedian().median(arr1, arr1.length));
    ArrayUtil.display(arr1);

  }
  public int median(int A[],int N)
  {
    
     Arrays.sort(A);
     if(N%2==0)
     {
    return   (A[(N/2)-1]+A[N/2])/2;
       
       
     }else
     {
       return A[N/2];
     }
     
     //Your code here
     //If median is fraction then conver it to integer and return
  }
  
  public int mean(int A[],int N)
  {
    int sum=0;
    for(int i=0;i<N;i++)
    {
      sum+=A[i];
    }
    return sum/N;
    
  }

}
