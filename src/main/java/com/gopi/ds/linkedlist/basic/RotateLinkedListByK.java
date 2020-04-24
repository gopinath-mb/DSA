/**
 * Created by gopinath_mb on 22-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1/?track=PC-W5-LL&batchId=154
public class RotateLinkedListByK
{
  public Node rotate(Node head, int k)
  {
    Node temp = head;
    Node newHead = head;
    int count = 1;
    while (temp != null && temp.next != null)
    {
      if (count == k)
      {
        newHead = temp.next;
        Node endNode = temp;
        temp = temp.next;
        endNode.next = null;
      } else
      {
        temp = temp.next;
      }
      count++;
    }
    if (temp != null && count > k)
    {
      temp.next = head;
      return newHead;
    }
    return head;
  }

  @Test
  public void testRotateBy1()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    Node newHead = rotate(head, 1);
    String linkedList = LinkedListUtil.getLinkedList(newHead);
    Assert.assertEquals("2->3->4->5->1" ,linkedList);
  }
  
  @Test
  public void testRotateBy3()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    Node newHead = rotate(head, 3);
    String linkedList = LinkedListUtil.getLinkedList(newHead);
    Assert.assertEquals("4->5->1->2->3" ,linkedList);
  }
  
  @Test
  public void testRotateWhenOnlyOneNodeExists()
  {
    Node head = LinkedListUtil.createSLL(1);
    Node newHead = rotate(head, 1);
    String linkedList = LinkedListUtil.getLinkedList(newHead);
    Assert.assertEquals("1" ,linkedList);
  }
  
  @Test
  public void testRotateWhenListIsEmpty()
  {
    Node head = LinkedListUtil.createSLL();
    Node newHead = rotate(head, 3);
    String linkedList = LinkedListUtil.getLinkedList(newHead);
    Assert.assertEquals("" ,linkedList);
  }
  
  @Test
  public void testRotateByNumberOfNodes()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    Node newHead = rotate(head, 5);
    String linkedList = LinkedListUtil.getLinkedList(newHead);
    Assert.assertEquals("1->2->3->4->5" ,linkedList);
  }
  
  @Test
  public void testRotateByMorethanNumberOfNodes()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    Node newHead = rotate(head, 10);
    String linkedList = LinkedListUtil.getLinkedList(newHead);
    Assert.assertEquals("1->2->3->4->5" ,linkedList);
  }
}
