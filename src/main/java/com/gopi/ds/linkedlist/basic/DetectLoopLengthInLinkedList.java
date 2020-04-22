/**
 * Created by gopinath_mb on 22-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/find-length-of-loop/1/?track=PC-W5-LL&batchId=154
public class DetectLoopLengthInLinkedList
{
  int countNodesinLoop(Node head)
  {
    Node slow = head;
    Node fast = head;
    int count = 0;
    while (fast != null && fast.next != null)
    {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast)
      {
        count = 1;
        while (slow.next != fast)
        {
          count++;
          slow = slow.next;
        }
        break;
      }
    }
    return count;
  }

  @Test
  public void testDetectLoopLengthWhereLoopExists()
  {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node head = LinkedListUtil.createSLL(node1, node2, node3, node4, node2);
    Assert.assertEquals(3, countNodesinLoop(head));
  }

  @Test
  public void testDetectLoopLengthWhereItIsASelfLoopInHead()
  {
    Node node1 = new Node(1);
    Node head = LinkedListUtil.createSLL(node1, node1);
    Assert.assertEquals(1, countNodesinLoop(head));
  }

  @Test
  public void testDetectLoopLengthWhereThereIsNoLoopThoughDataIsSame()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 2);
    Assert.assertEquals(0, countNodesinLoop(head));
  }

  @Test
  public void testDetectLoopLengthWhereThereIsNoLoop()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    Assert.assertEquals(0, countNodesinLoop(head));
  }

}
