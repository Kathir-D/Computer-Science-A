//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class Unit5b_DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		Unit5b_Discount d = new Unit5b_Discount( amt );
		out.printf("Bill after discount :: %.2f \n\n" , d.getTheBill());
	}
}


/*
Lab Description : Determine the amount of discount a person should receive. If the bill is more than
2000, then the person should receive a 15% discount. If the bill is 2000 dollars or less, the person does not
receive a discount of any kind.
Sample Data:
500
2500
4000
333.33
95874.2154
Sample Output :
Enter the original bill amount :: 500
Bill after discount :: 500.00
Enter the original bill amount :: 2500
Bill after discount :: 2125.00
Enter the original bill amount :: 4000
Bill after discount :: 3400.00
Enter the original bill amount :: 333.333
Bill after discount :: 333.33
Enter the original bill amount :: 95874.2154
Bill after discount :: 81493.08
 */