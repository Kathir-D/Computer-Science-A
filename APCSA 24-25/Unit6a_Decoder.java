//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit6a_Decoder
{
	public String deCode( String s )
	{
		String result="";

		if ((int) s.charAt(0) >= 97){
			return s.toUpperCase();
		} else if ((int) s.charAt(0) >= 65 && (int) s.charAt(0) <= 90){
			return s.toLowerCase();
		} else if ((int) s.charAt(0) >= 48 && (int) s.charAt(0) <= 57){
			int temp = Integer.parseInt(s);
			temp += 17;
			temp += 48;
			return ""+(char)temp;
		} else {
			return "#";
		}
	}
}

/*
Lab Description : You are to decode each letter. The following explains how to decode each
letter. You can easily do all of the conversions using the ASCII values of the letters.
LowerCase becomes UpperCase
UpperCase becomes LowerCase
Digits 0-9 become A-J
Any other characters become #
ASCII values
A – 65
a – 97
0 - 48
Sample Data :
a
A
b
0
T
*
H
T
Sample Output :
Enter a letter :: a
a decodes to A
Enter a letter :: A
A decodes to a
Enter a letter :: b
b decodes to B
Enter a letter :: 0
0 decodes to A
Enter a letter :: t
t decodes to T
Enter a letter :: *
* decodes to #
Enter a letter :: h
h decodes to H
Enter a letter :: T
T decodes to t
 */