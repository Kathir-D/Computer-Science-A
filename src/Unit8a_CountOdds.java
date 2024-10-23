//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit8a_CountOdds
{
	public static int go( int number )
	{
		int sum = 0;
			while (number > 0) {
				if ((number % 10) % 2 == 1) {
					sum++;
				}
				number /= 10;
            }

		return sum;

	}
}

/*
Lab Goal : This lab will focus on decision making and iteration [ looping ] while reviewing accessing
numeric digits using mod and divide.
Lab Description : Write a program that will count all of a numbers odd digits. You must use % for this
lab to access the right most digit of the number. You will use / to chop off the right most digit. You will also
need to use % mod to check for remainders to determine odd or even.
Sample Data
234
10000
111
9005
84645
8547
123456789
55556468
8525455
8514548
111111
1212121212
222222
Sample Output
1
1
3
2
1
2
5
4
4
3
6
5
0
 */