/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1/?track=PC-W5-LL&batchId=154
public class RemoveDuplicatesFromUnSortedLinkedList {

  public Node removeDuplicates(Node head) 
  {    
       Node temp=head.next;
       Node cur=head;
       cur.next=null;
      
       Set<Integer> set=new HashSet<Integer>();
       set.add(head.data);
       while(temp!=null)
       {
           boolean nonduplicate=set.add(temp.data);
           if(nonduplicate)
           {
               cur.next=temp;
               cur=temp;
               temp=temp.next;
               cur.next=null;
           }
           else
           {
               Node prev=temp;
               temp=temp.next;
               prev.next=null;
           }
      
       }
       return head;
  }
  
}
