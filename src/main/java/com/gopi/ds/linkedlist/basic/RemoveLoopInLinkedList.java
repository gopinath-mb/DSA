/**
 * Created by gopinath_mb on 22-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gopinath_mb
 */
//
public class RemoveLoopInLinkedList
{
  public static void removeLoop(Node head)
  {
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast)
      {
        slow=head;
        while(slow.next!=fast.next)
        {
          slow=slow.next;
          fast=fast.next;
        }
        fast.next=null;
      }     
    }
  }

  @Test
  public void testRemoveLoopWhereLoopExists()
  {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node head = LinkedListUtil.createSLL(node1, node2, node3, node4, node2);
    removeLoop(head);
    Assert.assertEquals(4, LinkedListUtil.size(head));
  }

  @Test
  public void testRemoveLoopWhereItIsASelfLoopInHead()
  {
    Node node1 = new Node(1);
    Node head = LinkedListUtil.createSLL(node1, node1);
    removeLoop(head);
    Assert.assertEquals(1, LinkedListUtil.size(head));
  }

  @Test
  public void testRemoveLoopWhereThereIsNoLoopThoughDataIsSame()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 2);
    removeLoop(head);
    Assert.assertEquals(5, LinkedListUtil.size(head));
  }

  @Test
  public void testRemoveLoopWhereThereIsNoLoop()
  {
    Node head = LinkedListUtil.createSLL(1, 2, 3, 4, 5);
    removeLoop(head);
    Assert.assertEquals(5, LinkedListUtil.size(head));
  }

}
