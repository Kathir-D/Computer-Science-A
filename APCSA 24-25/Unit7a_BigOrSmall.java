//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit7a_BigOrSmall
{
	public static String check( int a, int b )
	{
		if (a>b && a%2!=0){
			return "yes";
		}
		if (b>a && b%2!=0){
			return "no";
		}
		if (a == b && a%2==0 && b%2==0 ){
			return "aplus";
		}
		return "compsci";
	}
}

/*
Lab Goal : This lab will focus on decision making and if statements.
Lab Description : Write a method / function to evaluate 2 integer parameters.
If a > b and a is odd, return "yes".
If b > a and b is odd, return "no".
If a is equal to b and both are even, return "aplus".
Otherwise, return "compsci".
Sample Data:
10 20
20 10
20 20
10 10
0 1
1 0
3 5
5 3
55342 323
Sample Output :
compsci
compsci
aplus
aplus
no
yes
no
yes
compsci
Files Needed ::
BigOrSmall.java
BigOrSmallRunner.java
A+ Computer Science BIG OR SMALL
APLUS
 */