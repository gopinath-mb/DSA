/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gopinath_mb
 */
public class LinkedListUtil
{

  public static Node createSLL(int... nodesData)
  {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    Node head = singlyLinkedList.add(nodesData);
    return head;
  }

  public static Node createSLL()
  {
    System.out.println("Created Empty Linked List");
    return null;
  }

  public static Node createSLL(Node... nodesData)
  {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    Node head = singlyLinkedList.add(nodesData);
    return head;
  }

  public static int size(Node head)
  {
    int count = 0;
    Node temp = head;
    while (null != temp)
    {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public static void display(Node head)
  {

    System.out.print("Printing Linked List Elements: ");
    Node temp = head;
    while (null != temp)
    {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();

  }

  public static List<Integer> getLinkedList(Node head)
  {

    List<Integer> list = new ArrayList<Integer>();
    Node temp = head;
    while (null != temp)
    {
      list.add(temp.data);
      temp = temp.next;
    }
    return list;

  }
}
