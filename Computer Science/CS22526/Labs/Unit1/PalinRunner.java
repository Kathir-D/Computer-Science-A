//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class PalinRunner
{
	public static void main(String args[])
	{
		String[] words = "dog dad racecar goofy madam alligator benjamin".split(" ");
		for( String s : words )
		{
			Palin one = new Palin( s );
		   System.out.print(one.isPalin() ? one + " is a palindrome.\n" : one + " is not a palindrome.\n");
		}
	}
}