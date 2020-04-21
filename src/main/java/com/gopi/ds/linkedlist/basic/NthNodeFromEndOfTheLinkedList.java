/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import com.gopi.ds.linkedlist.old.Node;
import com.gopi.ds.linkedlist.old.SinglyLinkedList;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1/?track=PC-W5-LL&batchId=154
public class NthNodeFromEndOfTheLinkedList
{
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

  public static void main(String[] args)
  {

    SinglyLinkedList list = new SinglyLinkedList();
    Node head = list.createLinkedList(1, 2);
    Node nthNodeFromEndOfTheList = findNthNodeFromEndOfTheList(head, 1);
    System.out.println("1 node from end of the LinkedList is :" + nthNodeFromEndOfTheList.data);

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
    nthNodeFromEndOfTheList = findNthNodeFromEndOfTheList(head, 2);
    System.out.println("2 node from end of the LinkedList is :" + nthNodeFromEndOfTheList.data);

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    nthNodeFromEndOfTheList = findNthNodeFromEndOfTheList(head, 3);
    System.out.println("3 node from end of the LinkedList is :" + nthNodeFromEndOfTheList.data);

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    nthNodeFromEndOfTheList = findNthNodeFromEndOfTheList(head, 2);
    System.out.println("2 node from end of the LinkedList is :" + nthNodeFromEndOfTheList.data);

  }
  
  //https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1/?track=PC-W5-LL&batchId=154
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
  }
}
