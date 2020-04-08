/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.linkedlist;

import java.util.ArrayList;

/**
 * @author gopinath_mb
 * https://practice.geeksforgeeks.org/problems/leaders-in-an-array/1/?track=SPCF-Arrays&batchId=154
 */
public class FindLeaderInArray
{
  public static void main(String[] args)
  {
    int arr[]= {16, 17, 4, 3, 5, 2};
    
    System.out.println(leaders(arr,arr.length));
  }

  static ArrayList<Integer> leaders(int arr[], int n)
  {

    ArrayList<Integer> leadersList = new ArrayList<Integer>();
    int curLeader = arr[n - 1];
    leadersList.add(arr[n - 1]);

    for (int i = n - 2; i >= 0; i--)
    {
      if (arr[i] >= curLeader)
      {
        curLeader = arr[i];
        leadersList.add(curLeader);
      }
    }
    int i = 0;
    int j = leadersList.size() - 1;
    while (i < j)
    {
      int temp = leadersList.get(i);
      leadersList.set(i, leadersList.get(j));
      leadersList.set(j, temp);
      i++;
      j--;
    }
    return leadersList;
  }
}
