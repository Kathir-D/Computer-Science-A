//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit9a_DigitSum
{
	public static int go( String  w )
	{
        int s = 0;

		for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (Character.isDigit(c)) {
                s += Character.getNumericValue(c);
            }
        }

        return s;
	}
}

/*
Lab Goal : This lab was designed to teach you how to use for loops to manipulate and traverse strings.
You will need to know how to use loops and string methods to check each digit.
Lab Description : Loop through a string and sum up all single numeric digits.
Sample Data :
33
1010101
ABC
9A0B0#23?+
0
ABC7
-3-3?1@#$%4
Sample Output :
6
4
0
14
0
7
11
Files Needed ::
DigitSum.java
DigitSumRunner.java
A+ Computer Science DIGIT SUM

 */