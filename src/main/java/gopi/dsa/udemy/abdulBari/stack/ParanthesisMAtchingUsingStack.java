/**
 * Created With Love By Gopi on 15-Mar-2020
 */
package gopi.dsa.udemy.abdulBari.stack;

/**
 * @author Gopi
 */
public class ParanthesisMAtchingUsingStack
{
	public static void main(String[] args)
	{
		System.out.println(isMatching(""));
		System.out.println(isMatching("a+b"));
		System.out.println(isMatching("(a+b)*(a*b)"));
		System.out.println(isMatching("{[(a+b)*(a*b)]}"));
		System.out.println(isMatching("{[(a+b)*(a*b)}]"));
	}

	public static boolean isMatching(String expression)
	{
		System.out.println("Expression is :"+expression);
		if (!expression.isEmpty())
		{
			Stack stack = new Stack(expression.length());
			char[] charArray = expression.toCharArray();
			for (char ch : charArray)
			{
				if (ch == '{' || ch == '[' || ch == '(')
				{
					stack.push(ch);
				}
				if (ch == '}')
				{
					char pop = stack.pop();
					if ('{' != pop)
					{
						break;
					}
				} else if (ch == ']')
				{

					char pop = stack.pop();
					if ('[' != pop)
					{
						break;
					}

				} else if (ch == ')')
				{

					char pop = stack.pop();
					if ('(' != pop)
					{
						break;
					}

				}
			}
			if (stack.isEmpty())
			{
				return true;
			}
		}
		return false;
	}
}
