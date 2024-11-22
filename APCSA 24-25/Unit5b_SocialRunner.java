//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit5b_SocialRunner
{
	public static void main( String args[] )
	{
		Unit5b_Social s1 = new Unit5b_Social("463-44-5678");
		Unit5b_Social s2 = new Unit5b_Social("46-144-5678");
		Unit5b_Social s3 = new Unit5b_Social("111-44-5678");
		Unit5b_Social s4 = new Unit5b_Social("463044-5678");
		Unit5b_Social s5 = new Unit5b_Social("463-99-8888");
		Unit5b_Social s6 = new Unit5b_Social("123-11-5323");
		Unit5b_Social s7 = new Unit5b_Social("463-4-55678");
		Unit5b_Social s8 = new Unit5b_Social("46314415678");
		System.out.println(s1.go());
		System.out.println(s2.go());
		System.out.println(s3.go());
		System.out.println(s4.go());
		System.out.println(s5.go());
		System.out.println(s6.go());
		System.out.println(s7.go());
		System.out.println(s8.go());
	}
}


/*
Lab Description : Given a string, check to see if the string is a valid social security number. For this
program, social security numbers have a hyphen – at position 3 and at position 6. Return the last 4 numbers if
the social security number is valid. Return bad if the social security number is invalid.
Sample Data :
463-44-5678
46-144-5678
111-44-5678
463044-5678
463-99-8888
123-11-5323
463-4-55678
46314415678
Sample Output :
5678
bad
5678
bad
8888
5323
bad
bad
 */