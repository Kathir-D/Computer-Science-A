//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit2c_Quadratic
{
	public static double getRootOne( int a, int b, int c )
	{
		return ((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
	}
	
	public static double getRootTwo( int a, int b, int c )
	{
		return ((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
	}
}