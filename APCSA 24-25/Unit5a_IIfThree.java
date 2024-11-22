//(c) A+ Computer Science
// www.apluscompsci.com

//if statement practice 3

public class Unit5a_IIfThree
{
	public static String go( int num )
	{
	     if( num > 500  ) 
	        return "big";
	     return "little";
	}	
	
	public static void main(String args[])
	{
		//runner code
		System.out.println( go( 723 ) );
		System.out.println( go( 212 ) );
	}
}

