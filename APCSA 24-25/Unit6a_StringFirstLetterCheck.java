//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit6a_StringFirstLetterCheck
{
	public static boolean checkFirstLetter( String wordOne, String wordTwo )
	{
		if (wordOne.substring(0,1).equals(wordTwo.substring(0,1))){
			return true;
		}
		return false;
	}
}

/*
Lab Description : Compare two Strings to see if each of the two Strings has the same first letter.
Sample Data :
hello howdy
one two
three two
TCEA UIL
State Champions
ABC DEF
Doug Doggies
Sample Output :
true
false
true
false
false
false
true
 */