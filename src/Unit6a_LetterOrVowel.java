//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit6a_LetterOrVowel
{
	public static boolean check( String s )
	{
		String[] vowelsAndNums = {"a", "e", "i", "o", "u", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

		for (int i = 0; i < vowelsAndNums.length; i++) {
			if (s.substring(0,1).toLowerCase().equals(vowelsAndNums[i])){
				return true;
			}
		}

		return false;
	}
}

/*
Lab Description : Check a string to see if the first letter is a vowel or a number.
Sample Data :
apluscompsci
1forthemoney
chicken99
funkycoldsnow
APLUSCOMPSCI
77sodacans99
aardvark
cancancancan
Sample Output :
true
true
false
false
true
true
true
false
 */