/**
 * Program to check if 
 * the given string has balanced brackets or not.
 */

/**
 * @author nishthapradhan
 *
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CheckBalancingBrackets {

	// Function to check if character is bracket or not
	private static boolean checkForBrackets(int toCheckValue)
    {
		
		char[] brackets = {'(', ')', '{', '}', '[', ']'};
        boolean test = false;
        for (int element : brackets) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        return false;
    }
	
	// Function to check if brackets are balanced
	static boolean areBracketsBalanced(String expr)
	{
	
		Stack<Character> stack = new Stack<Character>();

		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++)
		{
			char x = expr.charAt(i);
			
			// Check if character is bracket or not: 
			boolean test_bracket = checkForBrackets(x);
			if(test_bracket == false) {
				System.out.println("Unfortunetly, we can not continue. \n"
						+ "This program only takes bracket values.");
				return false;
			}
			
			if (x == '(' || x == '[' || x == '{')
			{
				// Push the opening bracket in the stack
				stack.push(x);
				continue;
			}

			// If current character is not opening
			// bracket, then it must be closing. 
			//So stack cannot be empty at this point.
			if (stack.isEmpty()) {
				return false;
			}
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

	
}
