/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
public class SinglyLinkedList
{

  private Node head;

  public Node add(int... nodesData)
  {
    
    StringBuilder sb = new StringBuilder();
    for (int data : nodesData)
    {
      if (sb.length() == 0)
      {
        sb.append(data);
      } else
      {
        sb.append("->" + data);
      }
      addLast(data);
    }
    System.out.print("Created Linked List with Nodes: "+sb.toString());
    System.out.println();
    return head;
  }

  public Node add(Node... nodesData)
  {
    System.out.println("Creating Linked List with Nodes: ");
    for (Node data : nodesData)
    {
      System.out.print(data.data + " ");
      addLast(data);
    }
    System.out.println();
    return head;
  }

  public Node addFirst(int data)
  {
    Node node = new Node(data);
    node.next = head;
    head = node;
    return head;
  }

  public Node addLast(int data)
  {
    Node node = new Node(data);
    if (null == head)
    {
      head = node;
      return head;
    }
    Node temp = head;
    while (null != temp.next)
    {
      temp = temp.next;
    }
    temp.next = node;
    return head;
  }

  public Node addLast(Node node)
  {
    if (null == head)
    {
      head = node;
      return head;
    }
    Node temp = head;
    while (null != temp.next)
    {
      temp = temp.next;
    }
    temp.next = node;
    return head;
  }

  /*
   * Pos starts from zero.Root is at Pos 0.
   */
  public Node addAtPos(int pos, int data)
  {
    Node node = new Node(data);
    if (0 == pos || null == head)
    {
      node.next = head;
      head = node;
      return head;
    }
    Node temp = head;
    for (int i = 0; i < pos - 1 && null != temp.next; i++)
    {
      temp = temp.next;
    }
    node.next = temp.next;
    temp.next = node;
    return head;
  }

  public Node removeFirst()
  {
    if (null == head)
    {
      return null;
    }
    if (null == head.next)
    {
      head = null;
      return head;
    }
    Node temp = head;
    head = head.next;
    temp.next = null;
    return head;
  }

  public Node removeLast()
  {
    if (null == head)
    {
      return null;
    }
    if (null == head.next)
    {
      head = null;
      return head;
    }
    Node temp = head;
    while (null != temp.next.next)
    {
      temp = temp.next;
    }
    temp.next = null;
    return head;
  }

  public void display()
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

  public int count()
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

  public static void main(String[] args)
  {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.addAtPos(5, 10);
    sll.addAtPos(3, 40);
    sll.addAtPos(2, 60);
    sll.addAtPos(2, 10);
    sll.display();
    System.out.println(sll.count());
    sll.removeFirst();
    sll.display();
    sll.removeLast();
    sll.display();
    sll.removeLast();
    sll.display();
    sll.removeFirst();
    sll.display();
    sll.removeLast();
    sll.display();
  }
}
