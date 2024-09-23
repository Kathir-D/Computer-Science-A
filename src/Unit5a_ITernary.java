//(c) A+ Computer Science
// www.apluscompsci.com

//ternary example

import java.util.Scanner;

public class Unit5a_ITernary {

	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int num;

		System.out.print("Enter an integer :: ");
		num = keyboard.nextInt();

		                 //if    true    false
		String output =(num>100)?">100":"<=100";

		System.out.println("num is " + output );
	}
}
