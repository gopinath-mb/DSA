/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1/?track=PC-W5-LL&batchId=154
public class MergeTwoSortedLinkedList
{

  static Node sortedMerge(Node headA, Node headB)
  {
    if (headA == null)
      return headB;

    if (headB == null)
      return headA;

    Node temp = null;
    if (headA.data < headB.data)
    {
      temp = headA;
      headA = headA.next;
    } else
    {
      temp = headB;
      headB = headB.next;
    }
    // Don't change this as head should be fixed and temp variable should be
    // used for traversal.
    Node head = temp;
    while (headA != null && headB != null)
    {
      if (headA.data < headB.data)
      {
        temp.next = headA;
        headA = headA.next;
      } else
      {
        temp.next = headB;
        headB = headB.next;
      }
      temp = temp.next;
    }
    if (headA == null)
    {
      temp.next = headB;
    } else
    {
      temp.next = headA;
    }
    return head;
  }

  public static void main(String[] args)
  {
    Node headA = LinkedListUtil.createSLL(5, 10, 15, 40);
    Node headB = LinkedListUtil.createSLL(2, 3, 20);
    LinkedListUtil.display(headA);
    LinkedListUtil.display(headB);
    Node newHead = sortedMerge(headA, headB);
    LinkedListUtil.display(newHead);

    System.out.println();
    headA = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    headB = LinkedListUtil.createSLL(6, 7, 8, 9);
    LinkedListUtil.display(headA);
    LinkedListUtil.display(headB);
    newHead = sortedMerge(headA, headB);
    LinkedListUtil.display(newHead);

    System.out.println();
    headA = LinkedListUtil.createSLL();
    headB = LinkedListUtil.createSLL(6, 7, 8, 9);
    LinkedListUtil.display(headA);
    LinkedListUtil.display(headB);
    newHead = sortedMerge(headA, headB);
    LinkedListUtil.display(newHead);

  }
}
