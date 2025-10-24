package CS22526.Labs.Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class RomansRunner
{
	public static void main( String args[] )
	{
		Romans w = new Romans();
		System.out.println( w.getNumber( "V" ) );
		System.out.println( w.getNumber( "D" ) );
		System.out.println( w.getNumber( "M" ) );
	}
}