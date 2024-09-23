//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit5a_AsciiAdd
{
	public static boolean go(String a, int x)
	{
		if (a.length() > 1 && a.charAt(0) + a.charAt(a.length() - 1) > x) {
			return true;
		}

		return false;
	}
}

/*
Lab Description : Given a string and an integer value x, check to see if the ASCII sum of the first letter
and last letter are greater than x. Return true if the sum is greater than x. Return false if the sum is less than
x. Return false if there are less than 2 letters in the string.
Sample Data :
"funny", 100
"funny", 250
"A", 100
"AB", 200
"APLUS", 125
"&^#&@", 110
"0123456", 100
"DOG", 140
"CAT", 140
"#######COMP----SCI212", 125
Sample Output :
true
false
false
false
true
false
true
false
true
false
 */