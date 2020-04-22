/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.medium;

import com.gopi.ds.linkedlist.basic.LinkedListUtil;
import com.gopi.ds.linkedlist.basic.Node;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1/?track=PC-W5-LL&batchId=154
public class SwapKthNodeFromTheEndsInLinkedList
{
 static Node swapkthnode(Node head, int num, int k)
  {
    if (num == 1 || ((2 * k - 1) == num) )
    {
      return head;
    }

    Node prevOfStart = null;
    Node prevOfEnd = head;
    if (k == 1 || num == k)
    {
      for (int i = 1; i < num-1; i++)
      {
        prevOfEnd = prevOfEnd.next;
      }
      Node temp = prevOfEnd.next;
      temp.next = head.next == temp ? head : head.next;
      prevOfEnd.next = head;
      head.next = null;
      head = temp;
      return head;

    }
    prevOfStart = head;
    prevOfEnd = head;
    for (int i = 2; i < k; i++)
    {
      prevOfStart = prevOfStart.next;
    }
    for (int i = 2; i <= num - k; i++)
    {
      prevOfEnd = prevOfEnd.next;
    }
    if(prevOfEnd.next==prevOfStart)
    {
      Node temp=prevOfStart;
      prevOfStart=prevOfEnd;
      prevOfEnd=temp;
    }
    Node temp = prevOfEnd.next;
    Node temp2 = temp.next;
    temp.next = (prevOfStart.next.next==temp)?prevOfStart.next:prevOfStart.next.next;
    prevOfEnd.next = (prevOfStart.next==prevOfEnd)?temp2:prevOfStart.next;
    prevOfStart.next.next = temp2;
    prevOfStart.next = temp;
    return head;
  }

  public static void main(String[] args)
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5, 6, 7, 8);
    Node newHead = swapkthnode(head, 8, 2);
    LinkedListUtil.display(newHead);
    
    head = LinkedListUtil.createSLL(1, 2, 3, 4, 5, 6, 7, 8);
     newHead = swapkthnode(head, 8, 1);
    LinkedListUtil.display(newHead);
    
    head = LinkedListUtil.createSLL(1, 2, 3, 4);
     newHead = swapkthnode(head, 4, 2);
    LinkedListUtil.display(newHead);
    
    head = LinkedListUtil.createSLL(1, 2, 3, 4);
    newHead = swapkthnode(head, 4, 3);
   LinkedListUtil.display(newHead);
   
  }
}
