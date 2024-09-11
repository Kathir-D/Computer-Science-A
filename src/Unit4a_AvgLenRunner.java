//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit4a_AvgLenRunner
{
	public static void main( String args[] )
	{
		Unit4a_AvgLen s = new Unit4a_AvgLen();
		System.out.println( s.go( "dog", "cats" ) ) ;
		System.out.println( s.go( "aplus", "pigs" ) ) ;
		System.out.println( s.go( "catgiraffe", "apluscompsci" ) ) ;
		System.out.println( s.go( "ap", "aplus" ) ) ;
		System.out.println( s.go( "pluscat", "dogsaplus" ) ) ;
		
		//you can call static methods on a reference
		//or directly on the class name - Math.random() is another example
		
		System.out.println( Unit4a_AvgLen.go( "#", "#" ) ) ;
		System.out.println( Unit4a_AvgLen.go( "aplusdog#13337#", "pigaplusprogram" ) ) ;
		System.out.println( Unit4a_AvgLen.go( "code", "code1234" ) ) ;
		System.out.println( Unit4a_AvgLen.go( "wow", "eplus" ) ) ;
		System.out.println( Unit4a_AvgLen.go( "catsand" , "aplusdogsaplus" ) ) ;
		System.out.println( Unit4a_AvgLen.go( "7", "77777" ) ) ;
	}
}