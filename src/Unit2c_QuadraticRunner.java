//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Unit2c_QuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		Unit2c_Quadratic obj = new Unit2c_Quadratic();

		System.out.print( "Enter a :: " );
		int a = sc.nextInt();
		System.out.print( "Enter b :: " );
		int b = sc.nextInt();
		System.out.print( "Enter c :: " );
		int c = sc.nextInt();

		out.println("rootone :: " + String.format("%.2f",obj.getRootOne(a,b,c)));
		out.println("rootone :: " + String.format("%.2f",obj.getRootTwo(a,b,c)));




	}
}

/*

Sample Data :
5 -8 3
3 2 -7
9 6 1


Sample Output : 
Enter a :: 5
Enter b :: -8
Enter c :: 3


rootone :: 1.00
roottwo :: 0.60




Enter a :: 3
Enter b :: 2
Enter c :: -7


rootone :: 1.23
roottwo :: -1.90




Enter a :: 9
Enter b :: 6
Enter c :: 1


rootone :: -0.33
roottwo :: -0.33

*/