//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit8a_DigitMath
{
   public static int countDigits( int number )
	{
		int sum = 0;
		while(number>0){
			sum++;
			number = number/10;
		}
		return sum;
	}

   public static int sumDigits( int number )
	{
		int sum = 0;
		while (number > 0){
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	//method go must call countDigits and sumDigits
	//to receive full credit
	public static double go( int number )
	{
		return (double) sumDigits(number) / countDigits(number);
	}
}

/*
Lab Goal : This lab will focus on decision making and iteration [ looping ] while reviewing accessing
numeric digits using mod and divide.
Lab Description : Write a program that will average all of a numbers digits. You must use % for this
lab to access the right most digit of the number. You will use / to chop off the right most digit.
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
3.0
0.2
1.0
3.5
5.4
6.0
5.0
5.5
4.857142857142857
5.0
1.0
1.5
2.0
 */