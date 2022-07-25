import java.util.Scanner;

/**
 * Driver program for CheckBalancingBrackets program
 */

/**
 * @author nishthapradhan
 *
 */
public class Driver {
	
	// Driver code
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your string of brackets: ");
			String expr = sc.next();

			CheckBalancingBrackets cbb = new CheckBalancingBrackets();
			if (cbb.areBracketsBalanced(expr))
				System.out.println("The entered string has Balanced Brackets. ");
			else
				System.out.println("The entered strings do not contain Balanced Brackets. ");
			
			sc.close();
		
		}

}
