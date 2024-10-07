//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit7a_MoreMoreAplus
{
	/*
		Return "a" if the string does not contain an occurence of "aplus" and has an odd length.  
		Return "plus" if the string has at least 1 occurence of "aplus" and the length is even.  
		Return "comp" if an "aplus" if found starting at position 0 and at the end of the string.  
		Return "sci" in all other situations.	
	*/
   public static String go( String a )
	{
		int pos = a.indexOf( "aplus" );					
		if( pos == -1 && a.length()%2!=0 )
			   return "a";
		if( pos > -1 && a.length()%2==0 )
			   return "plus";
		if( pos == 0 && a.lastIndexOf( "aplus") == a.length()-"aplus".length() )
			   return "comp";			
		return "sci";
	}
}

/*
Lab Goal : This lab will focus on strings, decision making [ if, if else, and if else if statements ], and logical
operators.
Lab Description :
Return "a" if the string does not contain an occurrence of "aplus" and has an odd length.
Return "plus" if the string has at least 1 occurrence of "aplus" and the length is even.
Return "comp" if an "aplus" if found starting at position 0 and at the end of the string.
Return "sci" in all other situations.
Sample Data :
"rundm"
"thweekendaplus"
"aplusxyzaplus"
"apluaplus"
"pigs#apluscompsci#food"
"##catgiraffeapluscompsci"
"apluscatsanddogsaplus###"
"##"
"aplusdog#13337#pigaplusprogram"
"code#H00P#code1234"
"##wowgira77##eplus"
"catsandaplusdogsaplus###"
"7"
Sample Output :
a
plus
comp
sci
plus
plus
plus
sci
plus
sci
sci
plus
a
 */