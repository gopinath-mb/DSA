/**
 * Created by gopinath_mb on 29-Mar-2020
 */
package com.gopi.ds.linkedlist;

/**
 * @author gopinath_mb
 *
 * https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
 */

public class NthNodeFronEndOfTheList
{
  public static void main(String[] args)
  {

    SinglyLinkedList list = new SinglyLinkedList();
    Node head = list.createLinkedList(1, 2);
    Node findMiddleOfTheList = findNthNodeFromEndOfTheList(head,1);
    System.out.println("Middle of LL is " + findMiddleOfTheList.data);

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
    findMiddleOfTheList =  findNthNodeFromEndOfTheList(head,2);
    System.out.println("Middle of LL is " + findMiddleOfTheList.data);

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    findMiddleOfTheList =  findNthNodeFromEndOfTheList(head,3);
    System.out.println("Middle of LL is " + findMiddleOfTheList.data);
    
    head = list.createLinkedList(1, 2 ,3, 4, 5, 6, 7, 8, 9);
    findMiddleOfTheList =  findNthNodeFromEndOfTheList(head,2);
    System.out.println("Middle of LL is " + findMiddleOfTheList.data);
    
    

  }

  /**
   * @param head
   * @return
   */
  private static Node findNthNodeFromEndOfTheList(Node head, int pos)
  {

    Node slow = head;
    Node fast = head;
    int count = 1;
    while (fast != null && pos >= count)
    {
      fast = fast.next;
      count++;
    }
    if (null == fast)
    {
      System.out.println("No " + pos + " element from end of the list.");
      return null;
    }
    while (fast.next != null)
    {
      fast = fast.next;
      slow = slow.next;
    }

    return slow;
  }
  
  int getNthFromLast(Node head, int n)
  {
    Node slow = head;
    Node fast = head;
    int count = 1;
    while (fast != null && n > count)
    {
      fast = fast.next;
      count++;
    }
    if (null == fast)
    {
      return -1;
    }
    while (fast.next != null)
    {
      fast = fast.next;
      slow = slow.next;
    }

    return slow.data;
      // Your code here   
  }
}
