//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class Unit6a_LastFirst
{
	public static String check( String s)
	{
        if (Character.toString(s.charAt(0)).compareTo(Character.toString(s.charAt(s.length() - 1))) > 0) {
            return "aplus";
        } else if (Character.toString(s.charAt(0)).compareTo(Character.toString(s.charAt(s.length() - 1))) < 0) {
            return "compsci";
        } else {
            return "apluscompsci";
        }
	}
}

/*
Lab Description : If the first letter is bigger than the last, return “aplus”. If the last letter is bigger
than the first, return “compsci”. If the first and last letters are the same, return “apluscompsci”.
You will need to use compareTo for this lab to compare the first and last letters of the string.
Sample Data :
chickenisa
frog
chicken
theapluscompsci
aa
racecar
mommy
mom
dogsarebadboy
Sample Output :
aplus
compsci
compsci
aplus
apluscompsci
apluscompsci
compsci
apluscompsci
compsc
 */