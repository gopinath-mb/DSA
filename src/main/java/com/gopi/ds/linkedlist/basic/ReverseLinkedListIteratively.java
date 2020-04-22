/**
 * Created by gopinath_mb on 22-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/?track=PC-W5-LL&batchId=154
public class ReverseLinkedListIteratively
{

  static Node reverseList(Node head)
  {
    if (head == null || head.next == null)
    {
      return head;
    }
    Node prev = null;
    Node cur = head;
    Node next;
    while (cur != null)
    {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }

  static Node reverseList2(Node head)
  {
    Node prev = null;
    Node cur = head;
    Node next = null;

    while (null != cur)
    {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }

  public static void main(String[] args)
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5, 6);
    Node newHead = reverseList(head);
    LinkedListUtil.display(newHead);
    System.out.println();

    head = LinkedListUtil.createSLL(1);
    newHead = reverseList(head);
    LinkedListUtil.display(newHead);
    System.out.println();

    head = LinkedListUtil.createSLL(2, 7, 8, 9, 10);
    newHead = reverseList(head);
    LinkedListUtil.display(newHead);
    System.out.println();

    head = LinkedListUtil.createSLL();
    newHead = reverseList(head);
    LinkedListUtil.display(newHead);
    System.out.println();

  }

}
