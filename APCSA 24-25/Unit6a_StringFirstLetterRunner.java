//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Unit6a_StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		out.println(Unit6a_StringFirstLetterCheck.checkFirstLetter( "hello","howdy" ));
		out.println(Unit6a_StringFirstLetterCheck.checkFirstLetter( "one","two" ));
		out.println(Unit6a_StringFirstLetterCheck.checkFirstLetter( "three","two" ));
		out.println(Unit6a_StringFirstLetterCheck.checkFirstLetter( "TCEA","UIL" ));
		out.println(Unit6a_StringFirstLetterCheck.checkFirstLetter( "State","Champions" ));
		out.println(Unit6a_StringFirstLetterCheck.checkFirstLetter( "ABC","DEF" ));
		out.println(Unit6a_StringFirstLetterCheck.checkFirstLetter( "Doug","Doggies" ));
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