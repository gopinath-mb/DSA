/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

import java.util.ArrayList;

/**
 * @author gopinath_mb
 */
public class ReverseArrayInGroups
{

  public static void main(String[] args)
  {

    ArrayList<Integer> mv = new ArrayList<Integer>();
    mv.add(1);
    mv.add(2);
    mv.add(3);
    mv.add(4);
    mv.add(5);
    mv.add(6);
    mv.add(7);
    mv.add(8);

    System.out.println(reverseInGroups(mv, mv.size(), 3));
  }
//Function to reverse array in group of k 
  public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n,
      int k)
  {
    for (int i = 0; i < n; i = i + k)
    {
      int l = i;
      int j = i + k - 1;
      if (j > n - 1)
      {
        j = n-1;
      }
      while (l < j)
      {
        int temp = mv.get(l);
        mv.set(l, mv.get(j));
        mv.set(j, temp);
        l++;
        j--;
      }

    }

    return mv;

  }

}
