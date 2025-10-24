package CS22526.Labs.Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.sql.SQLOutput;

public class RomansRunner
{
	public static void main( String args[] )
	{
		Romans w = new Romans();
		System.out.println( w.getNumber( "V" ) );
		System.out.println( w.getNumber( "X" ) );
		System.out.println( w.getNumber( "C" ) );
    System.out.println();
    System.out.println( w.getNumber( "V I I" ) );
    System.out.println( w.getNumber( "X X" ) );
    System.out.println( w.getNumber( "C D M" ) );
    System.out.println( w.getNumber( "L" ) );
	}
}

/*
V I I
X X
C D M
L
 */