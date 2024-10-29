//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_CoolNumbers
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
   		 if (num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1) {
			return true;
	}
		 return false;
	}
	
	/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int count = 0;
		for (int i = 5; i < stop; i++){
			if (isCoolNumber(i)){
				count++;
			}
		}
		return count;
	}
}

/*
Lab Goal : This lab will focus on loops, decision making, and methods.
Lab Description : Complete methods isCoolNum( n ) && countCoolNumbers( n ).
isCoolNum( n) will determine if a number is a cool number. A cool number is any number that has a
remainder of 1 when divided by 3,4,5, and 6. countCoolNumbers will count the number of cool numbers
between 6 and the parameter passed in.
Basic for loop syntax :
for(int x=5; x<200; x=x+20)
{
//do something
}
Sample Data
250
1250
2250
5500
9500
23500
32500
Sample Output :
4 cool numbers between 6 - 250
20 cool numbers between 6 - 1250
37 cool numbers between 6 - 2250
91 cool numbers between 6 - 5500
158 cool numbers between 6 - 9500
391 cool numbers between 6 - 23500
541 cool numbers between 6 - 32500
Files Needed ::
CoolNumbers.java
CoolNumbersRunner.java
A+ Computer Science COOL
NUMBERS

 */