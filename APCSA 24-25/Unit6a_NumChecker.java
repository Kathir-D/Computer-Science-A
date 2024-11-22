//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class Unit6a_NumChecker
{
	public static int check( int x )
	{
		if (x % 5 == 0){
			return 1;
		} if (x % 4 == 0){
			return 2;
	} if (x % 3 == 0){
			return 3;
	} else {
			return 4;
	}
	}
}

/*
Lab Description : Your check method should receive a number and evaluate it. If the number is evenly
divisible by 5, return 1. If the number is evenly divisible by 4, return 2. If the number is evenly divisible by 3,
return 3. Return 4 for all other cases.
Sample Data :
212
100
25
88
99
7
8
10
5
Sample Output :
2
1
1
2
3
4
2
1
1
 */