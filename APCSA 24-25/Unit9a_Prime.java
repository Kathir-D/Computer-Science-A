//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_Prime
{
	public static boolean isPrime( int num )
	{
		if (num <= 1){
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

/*
© A+ Computer Science – for loops - www.apluscompsci.com
algorithm help
loop from 2 to square root of number
{
if( number is evenly divisible by any
number less than number )
{
//get here then number is not prime
}
}
//made it this far then number is prime
Lab Goal : This lab was designed to teach you how to use for loops and as a review of mod %.
Lab Description : Take any number and determine if it is prime. A prime number is only divisible by
itself and 1. For instance, 7 is prime because it is only evenly divisible by 1 and 7 ( itself ). 8 is not prime
because it has the divisors : 1,2,4,8
Sample Data :
24
7
100
113
65535
2
7334
7919
1115125003
Sample Output :
24 is not prime.
7 is prime.
100 is not prime.
113 is prime.
65535 is not prime.
2 is prime.
7334 is not prime.
7919 is prime.
1115125003 is not prime.
Files Needed ::
Prime.java
PrimeRunner.java
A+ Computer Science PRIME
NUMBER

 */