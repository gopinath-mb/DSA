/**
 * Created by gopinath_mb on 22-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import java.util.Scanner;
import java.util.Stack;

import org.junit.Test;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1/?track=PC-W5-LL&batchId=154
public class AddTwoLinkedListValues
{
  Node addTwoLists(Node first, Node second)
  {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    while (first != null)
    {
      s1.push(first.data);
      first = first.next;
    }
    while (second != null)
    {
      s2.push(second.data);
      second = second.next;
    }
    Node head = null;
    Node cur = null;
    int rem = 0;
    while (!s1.isEmpty() && !s2.isEmpty())
    {
      int sum = s1.pop() + s2.pop() + rem;
      rem = sum / 10;
      if (head == null)
      {
        head = new Node(sum % 10);
        cur = head;
      } else
      {
        cur.next = new Node(sum % 10);
        cur = cur.next;
      }
    }
    while (!s2.isEmpty())
    {
      int sum = s2.pop() + rem;
      rem = sum / 10;
      if (head == null)
      {
        head = new Node(sum % 10);
        cur = head;
      } else
      {
        cur.next = new Node(sum % 10);
        cur = cur.next;
      }
    }
    while (!s1.isEmpty())
    {
      int sum = s1.pop() + rem;
      rem = sum / 10;
      if (head == null)
      {
        head = new Node(sum % 10);
        cur = head;
      } else
      {
        cur.next = new Node(sum % 10);
        cur = cur.next;
      }
    }
    if (rem > 0)
    {
      cur.next = new Node(rem);
    }
    return head;
  }

//GFG
  Node addTwoListsGFG(Node first, Node second)
  {
    Node head = null;
    Node cur = null;
    int sum = 0;
    while (first != null || second != null)
    {
      if (first != null)
      {
        sum += first.data;
        first = first.next;
      }
      if (second != null)
      {
        sum += second.data;
        second = second.next;
      }
      int nodeVal = sum % 10;
      sum = sum / 10;
      if (head == null)
      {
        head = new Node(nodeVal);
        cur = head;
      } else
      {
        cur.next = new Node(nodeVal);
        cur = cur.next;
      }
    }
    if (sum > 0)
    {
      if (head == null)
      {
        head = new Node(sum);
        cur = head;
      } else
      {
        cur.next = new Node(sum);
      }
    }
    return head;
  }

  @Test
  public void testAddLists()
  {
    Node first = LinkedListUtil.createSLL(5, 4);
    Node second = LinkedListUtil.createSLL(5, 4, 3);
    Node addTwoLists = addTwoListsGFG(first, second);
    LinkedListUtil.display(addTwoLists);
    System.out.println();

    first = LinkedListUtil.createSLL(4, 5);
    second = LinkedListUtil.createSLL(3, 4, 5);
    addTwoLists = addTwoLists(first, second);
    LinkedListUtil.display(addTwoLists);
    System.out.println();
    first = LinkedListUtil.createSLL(6, 3);
    second = LinkedListUtil.createSLL(7);
    addTwoLists = addTwoLists(first, second);
    LinkedListUtil.display(addTwoLists);

  }
}
