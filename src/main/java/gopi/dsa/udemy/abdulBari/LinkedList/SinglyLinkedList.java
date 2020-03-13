/**
 * Created With Love By Gopi on 13-Mar-2020
 */
package gopi.dsa.udemy.abdulBari.LinkedList;

import java.awt.HeadlessException;
import java.util.Arrays;

/**
 * @author Gopi
 */
public class SinglyLinkedList
{
	Node head;

	public static void main(String[] args)
	{
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.createLinkedList(1, 2, 3, 4, 5, 6);
		singlyLinkedList.display();
		System.out.println("Displaying Linked List elements Recursively... ");
		singlyLinkedList.displayRecursively(singlyLinkedList.head);

		System.out.println("\nDisplaying Linked List elements in Reverse Recursively... ");
		singlyLinkedList.displayReverseRecursively(singlyLinkedList.head);

		System.out.println("\nSum of Elements Data :" + singlyLinkedList.sumOfElementsData(singlyLinkedList.head));
		
		System.out.println("Number of Nodes in LL :" + singlyLinkedList.count(singlyLinkedList.head));
	}

	/**
	 * 
	 */
	private void createLinkedList(int... elements)
	{
		System.out.println("Creating LinkedList with elements: " + Arrays.toString(elements));
		for (int i : elements)
		{
			add(i);
		}

	}

	public void add(int dataElement)
	{
		Node node = new Node(dataElement, null);
		if (null == head)
		{
			head = node;
		} else
		{
			Node temp = head;
			while (temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void display()
	{
		System.out.print("Displaying Elements : ");
		Node temp = head;
		while (null != temp)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
	}

	public void displayRecursively(Node temp)
	{
		if (temp == null)
		{
			return;
		}
		System.out.print(temp.data + " ");
		displayRecursively(temp.next);

	}

	public void displayRecursively2(Node temp)
	{
		if (null != temp)
		{
			System.out.print(temp.data + " ");
			displayRecursively(temp.next);
		}

	}

	public void displayReverseRecursively(Node temp)
	{
		if (null != temp)
		{
			displayReverseRecursively(temp.next);
			System.out.print(temp.data + " ");
		}

	}

	public int sumOfElementsData(Node head)
	{
		if (null == head)
		{
			return 0;
		}
		return (head.data + sumOfElementsData(head.next));

	}

	public int count(Node head)
	{
		if (null == head)
		{
			return 0;
		}
		return (1 + count(head.next));

	}
}

class Node
{
	int data;
	Node next;

	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}
