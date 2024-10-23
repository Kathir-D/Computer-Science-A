//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit8a_ReverseNumberRunner
{
	public static void main( String args[] )
	{
		int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222 };

		Unit8a_ReverseNumber s = new Unit8a_ReverseNumber();

		for( int val : cases )
		{
			System.out.println( s.getReverse( val ) );
		}
	}
}

/*
Lab Goal : This lab was designed to teach you how to use a while loop.
Lab Description : Write a program that will take an integer and reverse it. You must use a while loop
and % to perform the reverse.
Sample Data :
234
10000
111
9005
84645
8547
123456789
Sample Output :
234 reversed is 432
10000 reversed is 1
111 reversed is 111
9005 reversed is 5009
84645 reversed is 54648
8547 reversed is 7458
123456789 reversed is 987654321
 */