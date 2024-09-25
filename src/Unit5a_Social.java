//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class Unit5a_Social
{
   public static String go( String a )
	{
        if (a.substring(3, 4).equals("-") && a.substring(6, 7).equals("-")) {
			return "good";
		}

        return "bad";
	}
}



/*

Lab Description : Given a string, check to see if the string is a valid social security number. For this
program, social security numbers have a hyphen – at position 3 and at position 6. Return the last 4 numbers if
the social security number is valid. Return bad if the social security number is invalid.

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/