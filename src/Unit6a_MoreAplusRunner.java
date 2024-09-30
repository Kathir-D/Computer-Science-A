//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit6a_MoreAplusRunner
{
	public static void main( String args[] )
	{
		Unit6a_MoreAplus s = new Unit6a_MoreAplus();
		System.out.println(  s.go(  "dog#cat#pigaplus")    );
		System.out.println(  s.go(  "pigs#apluscompsci#food")    );
		System.out.println(  s.go(  "##catgiraffeapluscompsci")    );
		System.out.println(  s.go(  "apluscatsanddogsaplus###")    );
		System.out.println(  s.go(  "##")    );
		System.out.println(  s.go(  "aplusdog#13337#pigaplusprogram")    );
		System.out.println(  s.go(  "code#H00P#code1234")    );
		System.out.println(  s.go(  "##wowgira77##eplus")    );
		System.out.println(  s.go(  "catsandaplusdogsaplus###")    );
		System.out.println(  s.go(  "7")    );
	}
}

/*
Lab Description : Return "yes" if the string contains more than 1 "aplus". Return "no" if it does not
contain more than 1 "aplus".
Sample Data :
dog#cat#pigaplus
pigs#apluscompsci#food
##catgiraffeapluscompsci
apluscatsanddogsaplus###
###
aplusdog#13337#pigaplusprogram
code#H00P#code1234
##wowgira77##eplus
catsandaplusdogsaplus###
7
Sample Output :
no
no
no
yes
no
yes
no
no
yes
no
 */
