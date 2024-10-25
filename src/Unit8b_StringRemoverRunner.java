//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit8b_StringRemoverRunner
{
	public static void main( String args[] )
	{
		Unit8b_StringRemover a = new Unit8b_StringRemover("xR-MxR-MHelloxR-M", "R-M");
		System.out.println( a.toString() );
		Unit8b_StringRemover b = new Unit8b_StringRemover( "sxsssxssxsxssexssxsesss", "xs");
		System.out.println( b.toString() );
		Unit8b_StringRemover c = new Unit8b_StringRemover( "fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty");
		System.out.println( c.toString() );
		Unit8b_StringRemover d = new Unit8b_StringRemover( "dogdogcatddodogdogdoggog", "dog" );
		System.out.println( d.toString() );


	}
}

/*
Lab Description : Remove all occurrences of the removal string from the original string. Each time
you take out the removal string you must also remove the letter that preceded the removal string. After you
remove a string and its leading character, you must check to see if any more occurrences of the removal string
exist.
Sample Data :
xR-MxR-MHelloxR-M R-M
sxsssxssxsxssexssxsesss xs
fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn qwerty
dogdogcatddodogdogdoggog dog
Sample Output :
xR-MxR-MHelloxR-M - String to remove R-M
Hello
sxsssxssxsxssexssxsesss - String to remove xs
sesss
fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn - String to remove qwerty
fun
dogdogcatddodogdogdoggog - String to remove dog
catgog
 */