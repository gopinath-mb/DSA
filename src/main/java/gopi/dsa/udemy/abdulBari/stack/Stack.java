/**
 * Created With Love By Gopi on 15-Mar-2020
 */
package gopi.dsa.udemy.abdulBari.stack;

/**
 * @author Gopi
 */
public class Stack
{

	public static void main(String[] args)
	{
		Stack stack = new Stack(5);
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		stack.push('e');
		stack.push('f');
		stack.display();
		stack.pop();
		stack.push('g');
		stack.display();

	}

	char[] stack;

	int top = -1;

	int size;

	public Stack(int size)
	{
		this.size = size;
		stack = new char[size];
	}

	private void display()
	{
		System.out.print("\nStack data is : ");
		int temp = top;
		while (temp != -1)
		{
			System.out.print(" " + stack[temp]);
			temp--;
		}
	}

	void push(char data)
	{
		if (isFull())
		{
			System.err.println("StackOverflow");
		} else
		{
			stack[++top] = data;
		}
	}

	char pop()
	{
		if (isEmpty())
		{
			System.err.println("StackUnderflow");
			return ' ';
		}
		return stack[top--];
	}

	private boolean isFull()
	{
		return ((size - 1) == top);

	}

	boolean isEmpty()
	{
		return (-1 == top);

	}

}
