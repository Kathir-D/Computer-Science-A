//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_MultTensRunner
{
	public static void main( String[] args )
	{
		System.out.println( Unit9a_MultTens.go( 1 ) );
		System.out.println( Unit9a_MultTens.go( 2 ) );
		System.out.println( Unit9a_MultTens.go( 13 ) );
		System.out.println( Unit9a_MultTens.go( 4 ) );
		System.out.println( Unit9a_MultTens.go( 10 ) );
		System.out.println( Unit9a_MultTens.go( -5 ) );
		System.out.println( Unit9a_MultTens.go( 0 ) );
		System.out.println( Unit9a_MultTens.go( 6 ) );


	}
}

/*
Lab Goal : This lab will focus on variables, ifs, and loops.
Lab Description : Write a method that will return multiples of ten based on the parameter passed in. If
x is less than or equal to 0, return "aplus"
The call go( 3 ) would return "102030"
public static String go( int x )
{
}
Sample Data
1
2
13
4
10
-5
0
6
Sample Output
10
1020
102030405060708090100110120130
10203040
102030405060708090100
aplus
aplus
102030405060
Files Needed ::
MultTens.java
MultTensRunner.java
A+ Computer Science MULTIPLE OF
10s

 */