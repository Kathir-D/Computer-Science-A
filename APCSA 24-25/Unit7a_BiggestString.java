//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

public class Unit7a_BiggestString
{
	public static String getBiggest( String a, String b, String c )
	{
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0){
			return a;
		}
		if (b.compareTo(c) > 0 && b.compareTo(a) > 0){
			return b;
		}
		if (c.compareTo(a) > 0 && c.compareTo(b) > 0){
			return c;
		}

		return "a";
		// a.compareTo(b) || a.compareTo(c) || b.compareTo(a) || b.compareTo(c) || c.compareTo(a) || c.compareTo(b)
	}
}

/*
Lab Goal : The lab was designed to teach you how to use &&, ||, and !.
Lab Description : Compare three Strings to see which is the biggest. When comparing the strings, use
compareTo() to determine which one has the greatest alphabetical value.
Sample Data :
"abc" "cba" "bca"
"one" "fourteen" "twenty"
"124323" "20009" "3434"
"abcde" "ABCDE" "1234234324"
Sample Output :
abc cba bca
biggest = cba
one fourteen twenty
biggest = twenty
124323 20009 3434
biggest = 3434
abcde ABCDE 1234234324
biggest = abcde
 */