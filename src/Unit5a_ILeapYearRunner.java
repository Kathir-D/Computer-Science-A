//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Unit5a_ILeapYearRunner
{
	public static void main( String args[] )
	{		
		Scanner keyboard = new Scanner(System.in);
		Unit5a_ILeapYear obj = new Unit5a_ILeapYear();
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		String leapYear;
		if (obj.isLeapYear(year) == true){
			leapYear = "";
		} else {
			leapYear = "NOT";
		}
        System.out.println(year + " is " + leapYear + " a leap year.");
	}
}