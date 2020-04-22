/**
 * Created by gopinath_mb on 22-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1/?track=PC-W5-LL&batchId=154
public class DetectLoopInLinkedList
{
  public static boolean detectLoop(Node head)
  {
    Node slow = head;
    Node fast = head;
    
    while (fast != null && fast.next != null)
    {
      slow=slow.next;
      fast=fast.next.next;
      if(fast==slow)
      {
        return true;
      }
    }
    return false;
  }

  @Test
  public void testDetectLoopWhereLoopExists()
  {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node head = LinkedListUtil.createSLL(node1, node2, node3, node4, node2);
    Assert.assertTrue(detectLoop(head));
  }

  @Test
  public void testDetectLoopWhereItIsASelfLoopInHead()
  {
    Node node1 = new Node(1);
    Node head = LinkedListUtil.createSLL(node1, node1);
    Assert.assertTrue(detectLoop(head));
  }

  @Test
  public void testDetectLoopWhereThereIsNoLoopThoughDataIsSame()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 2);
    Assert.assertFalse(detectLoop(head));
  }

  @Test
  public void testDetectLoopWhereThereIsNoLoop()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    Assert.assertFalse(detectLoop(head));
  }

}
